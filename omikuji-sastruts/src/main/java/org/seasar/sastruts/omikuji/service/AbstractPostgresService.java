package org.seasar.sastruts.omikuji.service;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.jdbc.service.S2AbstractService;

public abstract class AbstractPostgresService<ENTITY> extends S2AbstractService<ENTITY> {
	
	@Resource(name = "postgreJdbcManager")
	public void setJdbcManager(JdbcManager jdbcManager) {
		this.jdbcManager = jdbcManager;
	}
}