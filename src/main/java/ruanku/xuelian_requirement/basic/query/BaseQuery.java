package ruanku.xuelian_requirement.basic.query;
public class BaseQuery {

    private int page = 1;//当前页数
    private int limit = 10;//每页显示条数 pageSize

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
