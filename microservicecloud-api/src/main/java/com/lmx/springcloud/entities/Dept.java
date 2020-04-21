package com.lmx.springcloud.entities;

import java.io.Serializable;

public class Dept implements Serializable { // Dept(Entity) orm mysql->Dept(table)类表关系迎神，必须序列化

    // 部门编号
    private Long deptNo;
    // 部门名称
    private String dname;
    // 来自于哪个数据库 因为微服务架构一个服务可以对应一个数据库，同一个信息可以存储在不同的库中
    private String db_source;

    public Dept(){}
    public Dept(Long deptNo, String dname, String db_source) {
        this.deptNo = deptNo;
        this.dname = dname;
        this.db_source = db_source;
    }

    public Long getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Long deptNo) {
        this.deptNo = deptNo;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptNo=" + deptNo +
                ", dname='" + dname + '\'' +
                ", db_source='" + db_source + '\'' +
                '}';
    }
}
