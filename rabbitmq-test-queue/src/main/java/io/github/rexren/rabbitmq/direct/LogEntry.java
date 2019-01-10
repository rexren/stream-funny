package io.github.rexren.rabbitmq.direct;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class LogEntry implements Serializable {
    private String id;
    private int type;
    private Date time;
    private String content;
    private String severity;

    public LogEntry() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return id == logEntry.id &&
                type == logEntry.type &&
                Objects.equals(time, logEntry.time) &&
                Objects.equals(content, logEntry.content) &&
                Objects.equals(severity, logEntry.severity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, type, time, content, severity);
    }

    @Override
    public String toString() {
        return "LogEntry{" +
                "id=" + id +
                ", type=" + type +
                ", time=" + time +
                ", content='" + content + '\'' +
                ", severity='" + severity + '\'' +
                '}';
    }
}
