package nwpu.software.base.model;

public class PageResult<T> {
    private List<T> items;
    private long counts;    // 总记录数
    private long page;      // 当前页码
    private long pageSize; // 每页记录数

    public PageResult(List<T> items, long counts, long page, long pageSize) {
        this.items = items;
        this.counts = counts;
        this.page = page;
        this.pageSize = pageSize;
    }

}
