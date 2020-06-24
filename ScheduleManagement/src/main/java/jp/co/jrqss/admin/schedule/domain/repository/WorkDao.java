package jp.co.jrqss.admin.schedule.domain.repository;

import java.util.List;

import jp.co.jrqss.admin.schedule.domain.model.Work;

public interface WorkDao {
	public List<Work> selectAll();
}
