package ruanku.xuelian_requirement.common.utils;

import java.util.ArrayList;
import java.util.List;

//分页
public class PageList<T> {

    private long total = 0;
    private List<T> rows = new ArrayList<T>();

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}