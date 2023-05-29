package vn.unikcore.nextcrmads.predicate.source;

import vn.unikcore.nextcrmads.predicate.shared.ReplicationMethod;
import vn.unikcore.nextcrmads.predicate.shared.TunnelMethod;

public class PostgresConfiguration {
    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public Integer getPort() {
        return port;
    }
    public void setPort(Integer port) {
        this.port = port;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getSourceType() {
        return sourceType;
    }
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
    public String getDatabase() {
        return database;
    }
    public void setDatabase(String database) {
        this.database = database;
    }
    public String[] getSchemas() {
        return schemas;
    }
    public void setSchemas(String[] schemas) {
        this.schemas = schemas;
    }
    public ReplicationMethod getReplication_method() {
        return replication_method;
    }
    public void setReplication_method(ReplicationMethod replication_method) {
        this.replication_method = replication_method;
    }
    public TunnelMethod getTunnel_method() {
        return tunnel_method;
    }
    public void setTunnel_method(TunnelMethod tunnel_method) {
        this.tunnel_method = tunnel_method;
    }

    private String host;
    private Integer port;
    private String username;
    private String password;
    private String sourceType;
    private String database;
    private String[] schemas;
    private ReplicationMethod replication_method;
    private TunnelMethod tunnel_method;
}
