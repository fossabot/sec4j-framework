package com.sec4j.framework.db.impl;

import javax.sql.DataSource;
import com.sec4j.framework.core.ConfigHelper;
import com.sec4j.framework.db.DataSourceFactory;

public abstract class AbstractDataSourceFactory<T extends DataSource> implements DataSourceFactory {

	protected final String driver = ConfigHelper.getString("sec4j.framework.jdbc.driver");
    protected final String url = ConfigHelper.getString("sec4j.framework.jdbc.url");
    protected final String username = ConfigHelper.getString("sec4j.framework.jdbc.username");
    protected final String password = ConfigHelper.getString("sec4j.framework.jdbc.password");

    @Override
    public final T getDataSource() {
        // 创建数据源对象
        T ds = createDataSource();
        // 设置基础属性
        setDriver(ds, driver);
        setUrl(ds, url);
        setUsername(ds, username);
        setPassword(ds, password);
        // 设置高级属性
        setAdvancedConfig(ds);
        return ds;
    }

    public abstract T createDataSource();

    public abstract void setDriver(T ds, String driver);

    public abstract void setUrl(T ds, String url);

    public abstract void setUsername(T ds, String username);

    public abstract void setPassword(T ds, String password);

    public abstract void setAdvancedConfig(T ds);

}
