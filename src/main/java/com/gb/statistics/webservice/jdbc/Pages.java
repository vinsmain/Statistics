package main.java.com.gb.statistics.webservice.jdbc;

import java.util.Date;

/**
 * Created by Kogut Sergey on 12.06.17.
 */
public class Pages {
    private int id;
    private String url;
    private int siteId;
    private Date foundDateTime;
    private Date lastScanDate;

    public Pages(int id, String url, int siteId, Date foundDateTime, Date lastScanDate) {
        this.id = id;
        this.url = url;
        this.siteId = siteId;
        this.foundDateTime = foundDateTime;
        this.lastScanDate = lastScanDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public Date getFoundDateTime() {
        return foundDateTime;
    }

    public void setFoundDateTime(Date foundDateTime) {
        this.foundDateTime = foundDateTime;
    }

    public Date getLastScanDate() {
        return lastScanDate;
    }

    public void setLastScanDate(Date lastScanDate) {
        this.lastScanDate = lastScanDate;
    }
}
