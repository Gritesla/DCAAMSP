package com.hd.software.dcaamsp.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DpImportantBuildExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DpImportantBuildExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDpRespIdIsNull() {
            addCriterion("DP_RESP_ID is null");
            return (Criteria) this;
        }

        public Criteria andDpRespIdIsNotNull() {
            addCriterion("DP_RESP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespIdEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_ID =", value, "dpRespId");
            return (Criteria) this;
        }

        public Criteria andDpRespIdNotEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_ID <>", value, "dpRespId");
            return (Criteria) this;
        }

        public Criteria andDpRespIdGreaterThan(BigDecimal value) {
            addCriterion("DP_RESP_ID >", value, "dpRespId");
            return (Criteria) this;
        }

        public Criteria andDpRespIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_ID >=", value, "dpRespId");
            return (Criteria) this;
        }

        public Criteria andDpRespIdLessThan(BigDecimal value) {
            addCriterion("DP_RESP_ID <", value, "dpRespId");
            return (Criteria) this;
        }

        public Criteria andDpRespIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_ID <=", value, "dpRespId");
            return (Criteria) this;
        }

        public Criteria andDpRespIdIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_ID in", values, "dpRespId");
            return (Criteria) this;
        }

        public Criteria andDpRespIdNotIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_ID not in", values, "dpRespId");
            return (Criteria) this;
        }

        public Criteria andDpRespIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_ID between", value1, value2, "dpRespId");
            return (Criteria) this;
        }

        public Criteria andDpRespIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_ID not between", value1, value2, "dpRespId");
            return (Criteria) this;
        }

        public Criteria andDpRespDwmcIsNull() {
            addCriterion("DP_RESP_DWMC is null");
            return (Criteria) this;
        }

        public Criteria andDpRespDwmcIsNotNull() {
            addCriterion("DP_RESP_DWMC is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespDwmcEqualTo(String value) {
            addCriterion("DP_RESP_DWMC =", value, "dpRespDwmc");
            return (Criteria) this;
        }

        public Criteria andDpRespDwmcNotEqualTo(String value) {
            addCriterion("DP_RESP_DWMC <>", value, "dpRespDwmc");
            return (Criteria) this;
        }

        public Criteria andDpRespDwmcGreaterThan(String value) {
            addCriterion("DP_RESP_DWMC >", value, "dpRespDwmc");
            return (Criteria) this;
        }

        public Criteria andDpRespDwmcGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DWMC >=", value, "dpRespDwmc");
            return (Criteria) this;
        }

        public Criteria andDpRespDwmcLessThan(String value) {
            addCriterion("DP_RESP_DWMC <", value, "dpRespDwmc");
            return (Criteria) this;
        }

        public Criteria andDpRespDwmcLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DWMC <=", value, "dpRespDwmc");
            return (Criteria) this;
        }

        public Criteria andDpRespDwmcLike(String value) {
            addCriterion("DP_RESP_DWMC like", value, "dpRespDwmc");
            return (Criteria) this;
        }

        public Criteria andDpRespDwmcNotLike(String value) {
            addCriterion("DP_RESP_DWMC not like", value, "dpRespDwmc");
            return (Criteria) this;
        }

        public Criteria andDpRespDwmcIn(List<String> values) {
            addCriterion("DP_RESP_DWMC in", values, "dpRespDwmc");
            return (Criteria) this;
        }

        public Criteria andDpRespDwmcNotIn(List<String> values) {
            addCriterion("DP_RESP_DWMC not in", values, "dpRespDwmc");
            return (Criteria) this;
        }

        public Criteria andDpRespDwmcBetween(String value1, String value2) {
            addCriterion("DP_RESP_DWMC between", value1, value2, "dpRespDwmc");
            return (Criteria) this;
        }

        public Criteria andDpRespDwmcNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_DWMC not between", value1, value2, "dpRespDwmc");
            return (Criteria) this;
        }

        public Criteria andDpRespJzgdIsNull() {
            addCriterion("DP_RESP_JZGD is null");
            return (Criteria) this;
        }

        public Criteria andDpRespJzgdIsNotNull() {
            addCriterion("DP_RESP_JZGD is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespJzgdEqualTo(String value) {
            addCriterion("DP_RESP_JZGD =", value, "dpRespJzgd");
            return (Criteria) this;
        }

        public Criteria andDpRespJzgdNotEqualTo(String value) {
            addCriterion("DP_RESP_JZGD <>", value, "dpRespJzgd");
            return (Criteria) this;
        }

        public Criteria andDpRespJzgdGreaterThan(String value) {
            addCriterion("DP_RESP_JZGD >", value, "dpRespJzgd");
            return (Criteria) this;
        }

        public Criteria andDpRespJzgdGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_JZGD >=", value, "dpRespJzgd");
            return (Criteria) this;
        }

        public Criteria andDpRespJzgdLessThan(String value) {
            addCriterion("DP_RESP_JZGD <", value, "dpRespJzgd");
            return (Criteria) this;
        }

        public Criteria andDpRespJzgdLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_JZGD <=", value, "dpRespJzgd");
            return (Criteria) this;
        }

        public Criteria andDpRespJzgdLike(String value) {
            addCriterion("DP_RESP_JZGD like", value, "dpRespJzgd");
            return (Criteria) this;
        }

        public Criteria andDpRespJzgdNotLike(String value) {
            addCriterion("DP_RESP_JZGD not like", value, "dpRespJzgd");
            return (Criteria) this;
        }

        public Criteria andDpRespJzgdIn(List<String> values) {
            addCriterion("DP_RESP_JZGD in", values, "dpRespJzgd");
            return (Criteria) this;
        }

        public Criteria andDpRespJzgdNotIn(List<String> values) {
            addCriterion("DP_RESP_JZGD not in", values, "dpRespJzgd");
            return (Criteria) this;
        }

        public Criteria andDpRespJzgdBetween(String value1, String value2) {
            addCriterion("DP_RESP_JZGD between", value1, value2, "dpRespJzgd");
            return (Criteria) this;
        }

        public Criteria andDpRespJzgdNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_JZGD not between", value1, value2, "dpRespJzgd");
            return (Criteria) this;
        }

        public Criteria andDpRespJzsyxzIsNull() {
            addCriterion("DP_RESP_JZSYXZ is null");
            return (Criteria) this;
        }

        public Criteria andDpRespJzsyxzIsNotNull() {
            addCriterion("DP_RESP_JZSYXZ is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespJzsyxzEqualTo(String value) {
            addCriterion("DP_RESP_JZSYXZ =", value, "dpRespJzsyxz");
            return (Criteria) this;
        }

        public Criteria andDpRespJzsyxzNotEqualTo(String value) {
            addCriterion("DP_RESP_JZSYXZ <>", value, "dpRespJzsyxz");
            return (Criteria) this;
        }

        public Criteria andDpRespJzsyxzGreaterThan(String value) {
            addCriterion("DP_RESP_JZSYXZ >", value, "dpRespJzsyxz");
            return (Criteria) this;
        }

        public Criteria andDpRespJzsyxzGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_JZSYXZ >=", value, "dpRespJzsyxz");
            return (Criteria) this;
        }

        public Criteria andDpRespJzsyxzLessThan(String value) {
            addCriterion("DP_RESP_JZSYXZ <", value, "dpRespJzsyxz");
            return (Criteria) this;
        }

        public Criteria andDpRespJzsyxzLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_JZSYXZ <=", value, "dpRespJzsyxz");
            return (Criteria) this;
        }

        public Criteria andDpRespJzsyxzLike(String value) {
            addCriterion("DP_RESP_JZSYXZ like", value, "dpRespJzsyxz");
            return (Criteria) this;
        }

        public Criteria andDpRespJzsyxzNotLike(String value) {
            addCriterion("DP_RESP_JZSYXZ not like", value, "dpRespJzsyxz");
            return (Criteria) this;
        }

        public Criteria andDpRespJzsyxzIn(List<String> values) {
            addCriterion("DP_RESP_JZSYXZ in", values, "dpRespJzsyxz");
            return (Criteria) this;
        }

        public Criteria andDpRespJzsyxzNotIn(List<String> values) {
            addCriterion("DP_RESP_JZSYXZ not in", values, "dpRespJzsyxz");
            return (Criteria) this;
        }

        public Criteria andDpRespJzsyxzBetween(String value1, String value2) {
            addCriterion("DP_RESP_JZSYXZ between", value1, value2, "dpRespJzsyxz");
            return (Criteria) this;
        }

        public Criteria andDpRespJzsyxzNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_JZSYXZ not between", value1, value2, "dpRespJzsyxz");
            return (Criteria) this;
        }

        public Criteria andDpRespZdmjIsNull() {
            addCriterion("DP_RESP_ZDMJ is null");
            return (Criteria) this;
        }

        public Criteria andDpRespZdmjIsNotNull() {
            addCriterion("DP_RESP_ZDMJ is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespZdmjEqualTo(String value) {
            addCriterion("DP_RESP_ZDMJ =", value, "dpRespZdmj");
            return (Criteria) this;
        }

        public Criteria andDpRespZdmjNotEqualTo(String value) {
            addCriterion("DP_RESP_ZDMJ <>", value, "dpRespZdmj");
            return (Criteria) this;
        }

        public Criteria andDpRespZdmjGreaterThan(String value) {
            addCriterion("DP_RESP_ZDMJ >", value, "dpRespZdmj");
            return (Criteria) this;
        }

        public Criteria andDpRespZdmjGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_ZDMJ >=", value, "dpRespZdmj");
            return (Criteria) this;
        }

        public Criteria andDpRespZdmjLessThan(String value) {
            addCriterion("DP_RESP_ZDMJ <", value, "dpRespZdmj");
            return (Criteria) this;
        }

        public Criteria andDpRespZdmjLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_ZDMJ <=", value, "dpRespZdmj");
            return (Criteria) this;
        }

        public Criteria andDpRespZdmjLike(String value) {
            addCriterion("DP_RESP_ZDMJ like", value, "dpRespZdmj");
            return (Criteria) this;
        }

        public Criteria andDpRespZdmjNotLike(String value) {
            addCriterion("DP_RESP_ZDMJ not like", value, "dpRespZdmj");
            return (Criteria) this;
        }

        public Criteria andDpRespZdmjIn(List<String> values) {
            addCriterion("DP_RESP_ZDMJ in", values, "dpRespZdmj");
            return (Criteria) this;
        }

        public Criteria andDpRespZdmjNotIn(List<String> values) {
            addCriterion("DP_RESP_ZDMJ not in", values, "dpRespZdmj");
            return (Criteria) this;
        }

        public Criteria andDpRespZdmjBetween(String value1, String value2) {
            addCriterion("DP_RESP_ZDMJ between", value1, value2, "dpRespZdmj");
            return (Criteria) this;
        }

        public Criteria andDpRespZdmjNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_ZDMJ not between", value1, value2, "dpRespZdmj");
            return (Criteria) this;
        }

        public Criteria andDpRespJzmjIsNull() {
            addCriterion("DP_RESP_JZMJ is null");
            return (Criteria) this;
        }

        public Criteria andDpRespJzmjIsNotNull() {
            addCriterion("DP_RESP_JZMJ is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespJzmjEqualTo(String value) {
            addCriterion("DP_RESP_JZMJ =", value, "dpRespJzmj");
            return (Criteria) this;
        }

        public Criteria andDpRespJzmjNotEqualTo(String value) {
            addCriterion("DP_RESP_JZMJ <>", value, "dpRespJzmj");
            return (Criteria) this;
        }

        public Criteria andDpRespJzmjGreaterThan(String value) {
            addCriterion("DP_RESP_JZMJ >", value, "dpRespJzmj");
            return (Criteria) this;
        }

        public Criteria andDpRespJzmjGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_JZMJ >=", value, "dpRespJzmj");
            return (Criteria) this;
        }

        public Criteria andDpRespJzmjLessThan(String value) {
            addCriterion("DP_RESP_JZMJ <", value, "dpRespJzmj");
            return (Criteria) this;
        }

        public Criteria andDpRespJzmjLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_JZMJ <=", value, "dpRespJzmj");
            return (Criteria) this;
        }

        public Criteria andDpRespJzmjLike(String value) {
            addCriterion("DP_RESP_JZMJ like", value, "dpRespJzmj");
            return (Criteria) this;
        }

        public Criteria andDpRespJzmjNotLike(String value) {
            addCriterion("DP_RESP_JZMJ not like", value, "dpRespJzmj");
            return (Criteria) this;
        }

        public Criteria andDpRespJzmjIn(List<String> values) {
            addCriterion("DP_RESP_JZMJ in", values, "dpRespJzmj");
            return (Criteria) this;
        }

        public Criteria andDpRespJzmjNotIn(List<String> values) {
            addCriterion("DP_RESP_JZMJ not in", values, "dpRespJzmj");
            return (Criteria) this;
        }

        public Criteria andDpRespJzmjBetween(String value1, String value2) {
            addCriterion("DP_RESP_JZMJ between", value1, value2, "dpRespJzmj");
            return (Criteria) this;
        }

        public Criteria andDpRespJzmjNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_JZMJ not between", value1, value2, "dpRespJzmj");
            return (Criteria) this;
        }

        public Criteria andDpRespJzjgIsNull() {
            addCriterion("DP_RESP_JZJG is null");
            return (Criteria) this;
        }

        public Criteria andDpRespJzjgIsNotNull() {
            addCriterion("DP_RESP_JZJG is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespJzjgEqualTo(String value) {
            addCriterion("DP_RESP_JZJG =", value, "dpRespJzjg");
            return (Criteria) this;
        }

        public Criteria andDpRespJzjgNotEqualTo(String value) {
            addCriterion("DP_RESP_JZJG <>", value, "dpRespJzjg");
            return (Criteria) this;
        }

        public Criteria andDpRespJzjgGreaterThan(String value) {
            addCriterion("DP_RESP_JZJG >", value, "dpRespJzjg");
            return (Criteria) this;
        }

        public Criteria andDpRespJzjgGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_JZJG >=", value, "dpRespJzjg");
            return (Criteria) this;
        }

        public Criteria andDpRespJzjgLessThan(String value) {
            addCriterion("DP_RESP_JZJG <", value, "dpRespJzjg");
            return (Criteria) this;
        }

        public Criteria andDpRespJzjgLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_JZJG <=", value, "dpRespJzjg");
            return (Criteria) this;
        }

        public Criteria andDpRespJzjgLike(String value) {
            addCriterion("DP_RESP_JZJG like", value, "dpRespJzjg");
            return (Criteria) this;
        }

        public Criteria andDpRespJzjgNotLike(String value) {
            addCriterion("DP_RESP_JZJG not like", value, "dpRespJzjg");
            return (Criteria) this;
        }

        public Criteria andDpRespJzjgIn(List<String> values) {
            addCriterion("DP_RESP_JZJG in", values, "dpRespJzjg");
            return (Criteria) this;
        }

        public Criteria andDpRespJzjgNotIn(List<String> values) {
            addCriterion("DP_RESP_JZJG not in", values, "dpRespJzjg");
            return (Criteria) this;
        }

        public Criteria andDpRespJzjgBetween(String value1, String value2) {
            addCriterion("DP_RESP_JZJG between", value1, value2, "dpRespJzjg");
            return (Criteria) this;
        }

        public Criteria andDpRespJzjgNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_JZJG not between", value1, value2, "dpRespJzjg");
            return (Criteria) this;
        }

        public Criteria andDpRespDsgdIsNull() {
            addCriterion("DP_RESP_DSGD is null");
            return (Criteria) this;
        }

        public Criteria andDpRespDsgdIsNotNull() {
            addCriterion("DP_RESP_DSGD is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespDsgdEqualTo(String value) {
            addCriterion("DP_RESP_DSGD =", value, "dpRespDsgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDsgdNotEqualTo(String value) {
            addCriterion("DP_RESP_DSGD <>", value, "dpRespDsgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDsgdGreaterThan(String value) {
            addCriterion("DP_RESP_DSGD >", value, "dpRespDsgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDsgdGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DSGD >=", value, "dpRespDsgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDsgdLessThan(String value) {
            addCriterion("DP_RESP_DSGD <", value, "dpRespDsgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDsgdLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DSGD <=", value, "dpRespDsgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDsgdLike(String value) {
            addCriterion("DP_RESP_DSGD like", value, "dpRespDsgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDsgdNotLike(String value) {
            addCriterion("DP_RESP_DSGD not like", value, "dpRespDsgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDsgdIn(List<String> values) {
            addCriterion("DP_RESP_DSGD in", values, "dpRespDsgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDsgdNotIn(List<String> values) {
            addCriterion("DP_RESP_DSGD not in", values, "dpRespDsgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDsgdBetween(String value1, String value2) {
            addCriterion("DP_RESP_DSGD between", value1, value2, "dpRespDsgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDsgdNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_DSGD not between", value1, value2, "dpRespDsgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDxgdIsNull() {
            addCriterion("DP_RESP_DXGD is null");
            return (Criteria) this;
        }

        public Criteria andDpRespDxgdIsNotNull() {
            addCriterion("DP_RESP_DXGD is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespDxgdEqualTo(String value) {
            addCriterion("DP_RESP_DXGD =", value, "dpRespDxgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDxgdNotEqualTo(String value) {
            addCriterion("DP_RESP_DXGD <>", value, "dpRespDxgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDxgdGreaterThan(String value) {
            addCriterion("DP_RESP_DXGD >", value, "dpRespDxgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDxgdGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DXGD >=", value, "dpRespDxgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDxgdLessThan(String value) {
            addCriterion("DP_RESP_DXGD <", value, "dpRespDxgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDxgdLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DXGD <=", value, "dpRespDxgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDxgdLike(String value) {
            addCriterion("DP_RESP_DXGD like", value, "dpRespDxgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDxgdNotLike(String value) {
            addCriterion("DP_RESP_DXGD not like", value, "dpRespDxgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDxgdIn(List<String> values) {
            addCriterion("DP_RESP_DXGD in", values, "dpRespDxgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDxgdNotIn(List<String> values) {
            addCriterion("DP_RESP_DXGD not in", values, "dpRespDxgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDxgdBetween(String value1, String value2) {
            addCriterion("DP_RESP_DXGD between", value1, value2, "dpRespDxgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDxgdNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_DXGD not between", value1, value2, "dpRespDxgd");
            return (Criteria) this;
        }

        public Criteria andDpRespDscsIsNull() {
            addCriterion("DP_RESP_DSCS is null");
            return (Criteria) this;
        }

        public Criteria andDpRespDscsIsNotNull() {
            addCriterion("DP_RESP_DSCS is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespDscsEqualTo(String value) {
            addCriterion("DP_RESP_DSCS =", value, "dpRespDscs");
            return (Criteria) this;
        }

        public Criteria andDpRespDscsNotEqualTo(String value) {
            addCriterion("DP_RESP_DSCS <>", value, "dpRespDscs");
            return (Criteria) this;
        }

        public Criteria andDpRespDscsGreaterThan(String value) {
            addCriterion("DP_RESP_DSCS >", value, "dpRespDscs");
            return (Criteria) this;
        }

        public Criteria andDpRespDscsGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DSCS >=", value, "dpRespDscs");
            return (Criteria) this;
        }

        public Criteria andDpRespDscsLessThan(String value) {
            addCriterion("DP_RESP_DSCS <", value, "dpRespDscs");
            return (Criteria) this;
        }

        public Criteria andDpRespDscsLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DSCS <=", value, "dpRespDscs");
            return (Criteria) this;
        }

        public Criteria andDpRespDscsLike(String value) {
            addCriterion("DP_RESP_DSCS like", value, "dpRespDscs");
            return (Criteria) this;
        }

        public Criteria andDpRespDscsNotLike(String value) {
            addCriterion("DP_RESP_DSCS not like", value, "dpRespDscs");
            return (Criteria) this;
        }

        public Criteria andDpRespDscsIn(List<String> values) {
            addCriterion("DP_RESP_DSCS in", values, "dpRespDscs");
            return (Criteria) this;
        }

        public Criteria andDpRespDscsNotIn(List<String> values) {
            addCriterion("DP_RESP_DSCS not in", values, "dpRespDscs");
            return (Criteria) this;
        }

        public Criteria andDpRespDscsBetween(String value1, String value2) {
            addCriterion("DP_RESP_DSCS between", value1, value2, "dpRespDscs");
            return (Criteria) this;
        }

        public Criteria andDpRespDscsNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_DSCS not between", value1, value2, "dpRespDscs");
            return (Criteria) this;
        }

        public Criteria andDpRespDxcsIsNull() {
            addCriterion("DP_RESP_DXCS is null");
            return (Criteria) this;
        }

        public Criteria andDpRespDxcsIsNotNull() {
            addCriterion("DP_RESP_DXCS is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespDxcsEqualTo(String value) {
            addCriterion("DP_RESP_DXCS =", value, "dpRespDxcs");
            return (Criteria) this;
        }

        public Criteria andDpRespDxcsNotEqualTo(String value) {
            addCriterion("DP_RESP_DXCS <>", value, "dpRespDxcs");
            return (Criteria) this;
        }

        public Criteria andDpRespDxcsGreaterThan(String value) {
            addCriterion("DP_RESP_DXCS >", value, "dpRespDxcs");
            return (Criteria) this;
        }

        public Criteria andDpRespDxcsGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DXCS >=", value, "dpRespDxcs");
            return (Criteria) this;
        }

        public Criteria andDpRespDxcsLessThan(String value) {
            addCriterion("DP_RESP_DXCS <", value, "dpRespDxcs");
            return (Criteria) this;
        }

        public Criteria andDpRespDxcsLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DXCS <=", value, "dpRespDxcs");
            return (Criteria) this;
        }

        public Criteria andDpRespDxcsLike(String value) {
            addCriterion("DP_RESP_DXCS like", value, "dpRespDxcs");
            return (Criteria) this;
        }

        public Criteria andDpRespDxcsNotLike(String value) {
            addCriterion("DP_RESP_DXCS not like", value, "dpRespDxcs");
            return (Criteria) this;
        }

        public Criteria andDpRespDxcsIn(List<String> values) {
            addCriterion("DP_RESP_DXCS in", values, "dpRespDxcs");
            return (Criteria) this;
        }

        public Criteria andDpRespDxcsNotIn(List<String> values) {
            addCriterion("DP_RESP_DXCS not in", values, "dpRespDxcs");
            return (Criteria) this;
        }

        public Criteria andDpRespDxcsBetween(String value1, String value2) {
            addCriterion("DP_RESP_DXCS between", value1, value2, "dpRespDxcs");
            return (Criteria) this;
        }

        public Criteria andDpRespDxcsNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_DXCS not between", value1, value2, "dpRespDxcs");
            return (Criteria) this;
        }

        public Criteria andDpRespBncIsNull() {
            addCriterion("DP_RESP_BNC is null");
            return (Criteria) this;
        }

        public Criteria andDpRespBncIsNotNull() {
            addCriterion("DP_RESP_BNC is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespBncEqualTo(String value) {
            addCriterion("DP_RESP_BNC =", value, "dpRespBnc");
            return (Criteria) this;
        }

        public Criteria andDpRespBncNotEqualTo(String value) {
            addCriterion("DP_RESP_BNC <>", value, "dpRespBnc");
            return (Criteria) this;
        }

        public Criteria andDpRespBncGreaterThan(String value) {
            addCriterion("DP_RESP_BNC >", value, "dpRespBnc");
            return (Criteria) this;
        }

        public Criteria andDpRespBncGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_BNC >=", value, "dpRespBnc");
            return (Criteria) this;
        }

        public Criteria andDpRespBncLessThan(String value) {
            addCriterion("DP_RESP_BNC <", value, "dpRespBnc");
            return (Criteria) this;
        }

        public Criteria andDpRespBncLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_BNC <=", value, "dpRespBnc");
            return (Criteria) this;
        }

        public Criteria andDpRespBncLike(String value) {
            addCriterion("DP_RESP_BNC like", value, "dpRespBnc");
            return (Criteria) this;
        }

        public Criteria andDpRespBncNotLike(String value) {
            addCriterion("DP_RESP_BNC not like", value, "dpRespBnc");
            return (Criteria) this;
        }

        public Criteria andDpRespBncIn(List<String> values) {
            addCriterion("DP_RESP_BNC in", values, "dpRespBnc");
            return (Criteria) this;
        }

        public Criteria andDpRespBncNotIn(List<String> values) {
            addCriterion("DP_RESP_BNC not in", values, "dpRespBnc");
            return (Criteria) this;
        }

        public Criteria andDpRespBncBetween(String value1, String value2) {
            addCriterion("DP_RESP_BNC between", value1, value2, "dpRespBnc");
            return (Criteria) this;
        }

        public Criteria andDpRespBncNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_BNC not between", value1, value2, "dpRespBnc");
            return (Criteria) this;
        }

        public Criteria andDpRespGnfqsmIsNull() {
            addCriterion("DP_RESP_GNFQSM is null");
            return (Criteria) this;
        }

        public Criteria andDpRespGnfqsmIsNotNull() {
            addCriterion("DP_RESP_GNFQSM is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespGnfqsmEqualTo(String value) {
            addCriterion("DP_RESP_GNFQSM =", value, "dpRespGnfqsm");
            return (Criteria) this;
        }

        public Criteria andDpRespGnfqsmNotEqualTo(String value) {
            addCriterion("DP_RESP_GNFQSM <>", value, "dpRespGnfqsm");
            return (Criteria) this;
        }

        public Criteria andDpRespGnfqsmGreaterThan(String value) {
            addCriterion("DP_RESP_GNFQSM >", value, "dpRespGnfqsm");
            return (Criteria) this;
        }

        public Criteria andDpRespGnfqsmGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_GNFQSM >=", value, "dpRespGnfqsm");
            return (Criteria) this;
        }

        public Criteria andDpRespGnfqsmLessThan(String value) {
            addCriterion("DP_RESP_GNFQSM <", value, "dpRespGnfqsm");
            return (Criteria) this;
        }

        public Criteria andDpRespGnfqsmLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_GNFQSM <=", value, "dpRespGnfqsm");
            return (Criteria) this;
        }

        public Criteria andDpRespGnfqsmLike(String value) {
            addCriterion("DP_RESP_GNFQSM like", value, "dpRespGnfqsm");
            return (Criteria) this;
        }

        public Criteria andDpRespGnfqsmNotLike(String value) {
            addCriterion("DP_RESP_GNFQSM not like", value, "dpRespGnfqsm");
            return (Criteria) this;
        }

        public Criteria andDpRespGnfqsmIn(List<String> values) {
            addCriterion("DP_RESP_GNFQSM in", values, "dpRespGnfqsm");
            return (Criteria) this;
        }

        public Criteria andDpRespGnfqsmNotIn(List<String> values) {
            addCriterion("DP_RESP_GNFQSM not in", values, "dpRespGnfqsm");
            return (Criteria) this;
        }

        public Criteria andDpRespGnfqsmBetween(String value1, String value2) {
            addCriterion("DP_RESP_GNFQSM between", value1, value2, "dpRespGnfqsm");
            return (Criteria) this;
        }

        public Criteria andDpRespGnfqsmNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_GNFQSM not between", value1, value2, "dpRespGnfqsm");
            return (Criteria) this;
        }

        public Criteria andDpRespZdbwsmIsNull() {
            addCriterion("DP_RESP_ZDBWSM is null");
            return (Criteria) this;
        }

        public Criteria andDpRespZdbwsmIsNotNull() {
            addCriterion("DP_RESP_ZDBWSM is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespZdbwsmEqualTo(String value) {
            addCriterion("DP_RESP_ZDBWSM =", value, "dpRespZdbwsm");
            return (Criteria) this;
        }

        public Criteria andDpRespZdbwsmNotEqualTo(String value) {
            addCriterion("DP_RESP_ZDBWSM <>", value, "dpRespZdbwsm");
            return (Criteria) this;
        }

        public Criteria andDpRespZdbwsmGreaterThan(String value) {
            addCriterion("DP_RESP_ZDBWSM >", value, "dpRespZdbwsm");
            return (Criteria) this;
        }

        public Criteria andDpRespZdbwsmGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_ZDBWSM >=", value, "dpRespZdbwsm");
            return (Criteria) this;
        }

        public Criteria andDpRespZdbwsmLessThan(String value) {
            addCriterion("DP_RESP_ZDBWSM <", value, "dpRespZdbwsm");
            return (Criteria) this;
        }

        public Criteria andDpRespZdbwsmLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_ZDBWSM <=", value, "dpRespZdbwsm");
            return (Criteria) this;
        }

        public Criteria andDpRespZdbwsmLike(String value) {
            addCriterion("DP_RESP_ZDBWSM like", value, "dpRespZdbwsm");
            return (Criteria) this;
        }

        public Criteria andDpRespZdbwsmNotLike(String value) {
            addCriterion("DP_RESP_ZDBWSM not like", value, "dpRespZdbwsm");
            return (Criteria) this;
        }

        public Criteria andDpRespZdbwsmIn(List<String> values) {
            addCriterion("DP_RESP_ZDBWSM in", values, "dpRespZdbwsm");
            return (Criteria) this;
        }

        public Criteria andDpRespZdbwsmNotIn(List<String> values) {
            addCriterion("DP_RESP_ZDBWSM not in", values, "dpRespZdbwsm");
            return (Criteria) this;
        }

        public Criteria andDpRespZdbwsmBetween(String value1, String value2) {
            addCriterion("DP_RESP_ZDBWSM between", value1, value2, "dpRespZdbwsm");
            return (Criteria) this;
        }

        public Criteria andDpRespZdbwsmNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_ZDBWSM not between", value1, value2, "dpRespZdbwsm");
            return (Criteria) this;
        }

        public Criteria andDpRespZbxftdIsNull() {
            addCriterion("DP_RESP_ZBXFTD is null");
            return (Criteria) this;
        }

        public Criteria andDpRespZbxftdIsNotNull() {
            addCriterion("DP_RESP_ZBXFTD is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespZbxftdEqualTo(String value) {
            addCriterion("DP_RESP_ZBXFTD =", value, "dpRespZbxftd");
            return (Criteria) this;
        }

        public Criteria andDpRespZbxftdNotEqualTo(String value) {
            addCriterion("DP_RESP_ZBXFTD <>", value, "dpRespZbxftd");
            return (Criteria) this;
        }

        public Criteria andDpRespZbxftdGreaterThan(String value) {
            addCriterion("DP_RESP_ZBXFTD >", value, "dpRespZbxftd");
            return (Criteria) this;
        }

        public Criteria andDpRespZbxftdGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_ZBXFTD >=", value, "dpRespZbxftd");
            return (Criteria) this;
        }

        public Criteria andDpRespZbxftdLessThan(String value) {
            addCriterion("DP_RESP_ZBXFTD <", value, "dpRespZbxftd");
            return (Criteria) this;
        }

        public Criteria andDpRespZbxftdLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_ZBXFTD <=", value, "dpRespZbxftd");
            return (Criteria) this;
        }

        public Criteria andDpRespZbxftdLike(String value) {
            addCriterion("DP_RESP_ZBXFTD like", value, "dpRespZbxftd");
            return (Criteria) this;
        }

        public Criteria andDpRespZbxftdNotLike(String value) {
            addCriterion("DP_RESP_ZBXFTD not like", value, "dpRespZbxftd");
            return (Criteria) this;
        }

        public Criteria andDpRespZbxftdIn(List<String> values) {
            addCriterion("DP_RESP_ZBXFTD in", values, "dpRespZbxftd");
            return (Criteria) this;
        }

        public Criteria andDpRespZbxftdNotIn(List<String> values) {
            addCriterion("DP_RESP_ZBXFTD not in", values, "dpRespZbxftd");
            return (Criteria) this;
        }

        public Criteria andDpRespZbxftdBetween(String value1, String value2) {
            addCriterion("DP_RESP_ZBXFTD between", value1, value2, "dpRespZbxftd");
            return (Criteria) this;
        }

        public Criteria andDpRespZbxftdNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_ZBXFTD not between", value1, value2, "dpRespZbxftd");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}