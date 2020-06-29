package jp.co.jrqss.admin.schedule.domain.repository;

import java.util.List;

import jp.co.jrqss.admin.schedule.domain.model.Desire;

public interface DesireDao {
	public List<Desire> selectAll();
}
