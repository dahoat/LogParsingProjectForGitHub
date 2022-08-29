package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrTimeNode;
import at.daho.logparsingproject.logparser.model.CommonTimestamp;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HrTimestampServiceImpl implements HrTimestampService
{
	private final HrYearService yearService;
	private final HrMonthService monthService;
	private final HrDayService dayService;
	private final HrHourService hourService;
	private final HrMinuteService minuteService;
	private final HrSecondService secondService;

	private final JdbcTemplate jdbcTemplate;

	public HrTimestampServiceImpl(HrYearService yearService, HrMonthService monthService, HrDayService dayService, HrHourService hourService, HrMinuteService minuteService, HrSecondService secondService, JdbcTemplate jdbcTemplate)
	{
		this.yearService = yearService;
		this.monthService = monthService;
		this.dayService = dayService;
		this.hourService = hourService;
		this.minuteService = minuteService;
		this.secondService = secondService;
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void deleteAll()
	{
		yearService.deleteAll();
		monthService.deleteAll();
		dayService.deleteAll();
		hourService.deleteAll();
		minuteService.deleteAll();
		secondService.deleteAll();
	}

	@Override
	public HrTimeNode findOrCreate(CommonTimestamp commonTimestamp)
	{
		int year = commonTimestamp.getYear();
		int month = commonTimestamp.getMonth();
		int day = commonTimestamp.getDay();
		int hour = commonTimestamp.getHour();
		int minute = commonTimestamp.getMinute();
		int second = commonTimestamp.getSecond();

		yearService.findOrCreate(year);
		monthService.findOrCreate(year, month);
		dayService.findOrCreate(year, month, day);
		hourService.findOrCreate(year, month, day, hour);
		minuteService.findOrCreate(year, month, day, hour, minute);
		return secondService.findOrCreate(year, month, day, hour, minute, second);
	}

	@Override
	public CommonTimestamp getTimestamp(HrTimeNode timeNode) {
		Long startId = timeNode.getId();
		String query = "match p=((n)<-[:FINER*]-(m)) where id(n) = ? return p order by length(p) desc limit 1";
		Object[] args = {startId};
		return jdbcTemplate.queryForObject(query, args, (row, i) -> {
			List<Map<String, ?>> results = row.getObject(1, List.class);
			return processTimestampResult(results);
		});
	}

	private CommonTimestamp processTimestampResult(List<Map<String, ?>> queryResult) {
		final String _LABELS = "_labels";
		final String VALUE = "value";

		int year = 0;
		int month = 0;
		int day = 0;
		int hour = 0;
		int minute = 0;
		int second = 0;

		for(Map<String, ?> result : queryResult) {
			if(result.containsKey(_LABELS)) {
				for(String label: (List<String>) result.get(_LABELS)) {
					switch (label) {
						case "Hr_Second":
							second = ((Long) result.get(VALUE)).intValue();
							break;
						case "Hr_Minute":
							minute = ((Long) result.get(VALUE)).intValue();
							break;
						case "Hr_Hour":
							hour = ((Long) result.get(VALUE)).intValue();
							break;
						case "Hr_Day":
							day = ((Long) result.get(VALUE)).intValue();
							break;
						case "Hr_Month":
							month = ((Long) result.get(VALUE)).intValue();
							break;
						case "Hr_Year":
							year = ((Long) result.get(VALUE)).intValue();
							break;

						default:
					}
				}
			}
		}

		return new CommonTimestamp(year, month, day, hour, minute, second);
	}
}
