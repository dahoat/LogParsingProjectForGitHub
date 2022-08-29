package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrEvent;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrEventRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class HrQueryServiceImpl implements HrQueryService
{
	private final HrEventRepository hrEventRepository;

	public HrQueryServiceImpl(HrEventRepository hrEventRepository)
	{
		this.hrEventRepository = hrEventRepository;
	}

	@Override
	public List<HrEvent> findAllConnect()
	{
		List<HrEvent> connectWithIds = hrEventRepository.findAllConnect();
		return connectWithIds.stream().map(c -> hrEventRepository.findById(c.getId()).orElseThrow()).collect(Collectors.toList());
	}
}
