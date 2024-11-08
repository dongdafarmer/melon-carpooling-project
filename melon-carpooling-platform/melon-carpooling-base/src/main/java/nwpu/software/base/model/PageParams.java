package nwpu.software.base.model;

public class PageParams {
    private Long pageNo = 1L;   // 当前页码
    private Long pageSize = 10L;    // 每页显示记录数

    public PageParams() {
    }

    public PageParams(Long pageNo, Long pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}
