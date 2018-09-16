package com.hd.software.dcaamsp.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DpImportantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DpImportantExample() {
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

        public Criteria andDpRespFrdbIsNull() {
            addCriterion("DP_RESP_FRDB is null");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbIsNotNull() {
            addCriterion("DP_RESP_FRDB is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbEqualTo(String value) {
            addCriterion("DP_RESP_FRDB =", value, "dpRespFrdb");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbNotEqualTo(String value) {
            addCriterion("DP_RESP_FRDB <>", value, "dpRespFrdb");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbGreaterThan(String value) {
            addCriterion("DP_RESP_FRDB >", value, "dpRespFrdb");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_FRDB >=", value, "dpRespFrdb");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbLessThan(String value) {
            addCriterion("DP_RESP_FRDB <", value, "dpRespFrdb");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_FRDB <=", value, "dpRespFrdb");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbLike(String value) {
            addCriterion("DP_RESP_FRDB like", value, "dpRespFrdb");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbNotLike(String value) {
            addCriterion("DP_RESP_FRDB not like", value, "dpRespFrdb");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbIn(List<String> values) {
            addCriterion("DP_RESP_FRDB in", values, "dpRespFrdb");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbNotIn(List<String> values) {
            addCriterion("DP_RESP_FRDB not in", values, "dpRespFrdb");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbBetween(String value1, String value2) {
            addCriterion("DP_RESP_FRDB between", value1, value2, "dpRespFrdb");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_FRDB not between", value1, value2, "dpRespFrdb");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbdhIsNull() {
            addCriterion("DP_RESP_FRDBDH is null");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbdhIsNotNull() {
            addCriterion("DP_RESP_FRDBDH is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbdhEqualTo(String value) {
            addCriterion("DP_RESP_FRDBDH =", value, "dpRespFrdbdh");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbdhNotEqualTo(String value) {
            addCriterion("DP_RESP_FRDBDH <>", value, "dpRespFrdbdh");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbdhGreaterThan(String value) {
            addCriterion("DP_RESP_FRDBDH >", value, "dpRespFrdbdh");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbdhGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_FRDBDH >=", value, "dpRespFrdbdh");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbdhLessThan(String value) {
            addCriterion("DP_RESP_FRDBDH <", value, "dpRespFrdbdh");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbdhLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_FRDBDH <=", value, "dpRespFrdbdh");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbdhLike(String value) {
            addCriterion("DP_RESP_FRDBDH like", value, "dpRespFrdbdh");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbdhNotLike(String value) {
            addCriterion("DP_RESP_FRDBDH not like", value, "dpRespFrdbdh");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbdhIn(List<String> values) {
            addCriterion("DP_RESP_FRDBDH in", values, "dpRespFrdbdh");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbdhNotIn(List<String> values) {
            addCriterion("DP_RESP_FRDBDH not in", values, "dpRespFrdbdh");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbdhBetween(String value1, String value2) {
            addCriterion("DP_RESP_FRDBDH between", value1, value2, "dpRespFrdbdh");
            return (Criteria) this;
        }

        public Criteria andDpRespFrdbdhNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_FRDBDH not between", value1, value2, "dpRespFrdbdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrIsNull() {
            addCriterion("DP_RESP_AQZRR is null");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrIsNotNull() {
            addCriterion("DP_RESP_AQZRR is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrEqualTo(String value) {
            addCriterion("DP_RESP_AQZRR =", value, "dpRespAqzrr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrNotEqualTo(String value) {
            addCriterion("DP_RESP_AQZRR <>", value, "dpRespAqzrr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrGreaterThan(String value) {
            addCriterion("DP_RESP_AQZRR >", value, "dpRespAqzrr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_AQZRR >=", value, "dpRespAqzrr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrLessThan(String value) {
            addCriterion("DP_RESP_AQZRR <", value, "dpRespAqzrr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_AQZRR <=", value, "dpRespAqzrr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrLike(String value) {
            addCriterion("DP_RESP_AQZRR like", value, "dpRespAqzrr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrNotLike(String value) {
            addCriterion("DP_RESP_AQZRR not like", value, "dpRespAqzrr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrIn(List<String> values) {
            addCriterion("DP_RESP_AQZRR in", values, "dpRespAqzrr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrNotIn(List<String> values) {
            addCriterion("DP_RESP_AQZRR not in", values, "dpRespAqzrr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrBetween(String value1, String value2) {
            addCriterion("DP_RESP_AQZRR between", value1, value2, "dpRespAqzrr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_AQZRR not between", value1, value2, "dpRespAqzrr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrdhIsNull() {
            addCriterion("DP_RESP_AQZRRDH is null");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrdhIsNotNull() {
            addCriterion("DP_RESP_AQZRRDH is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrdhEqualTo(String value) {
            addCriterion("DP_RESP_AQZRRDH =", value, "dpRespAqzrrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrdhNotEqualTo(String value) {
            addCriterion("DP_RESP_AQZRRDH <>", value, "dpRespAqzrrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrdhGreaterThan(String value) {
            addCriterion("DP_RESP_AQZRRDH >", value, "dpRespAqzrrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrdhGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_AQZRRDH >=", value, "dpRespAqzrrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrdhLessThan(String value) {
            addCriterion("DP_RESP_AQZRRDH <", value, "dpRespAqzrrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrdhLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_AQZRRDH <=", value, "dpRespAqzrrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrdhLike(String value) {
            addCriterion("DP_RESP_AQZRRDH like", value, "dpRespAqzrrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrdhNotLike(String value) {
            addCriterion("DP_RESP_AQZRRDH not like", value, "dpRespAqzrrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrdhIn(List<String> values) {
            addCriterion("DP_RESP_AQZRRDH in", values, "dpRespAqzrrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrdhNotIn(List<String> values) {
            addCriterion("DP_RESP_AQZRRDH not in", values, "dpRespAqzrrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrdhBetween(String value1, String value2) {
            addCriterion("DP_RESP_AQZRRDH between", value1, value2, "dpRespAqzrrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqzrrdhNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_AQZRRDH not between", value1, value2, "dpRespAqzrrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzyxIsNull() {
            addCriterion("DP_RESP_DWDZYX is null");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzyxIsNotNull() {
            addCriterion("DP_RESP_DWDZYX is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzyxEqualTo(String value) {
            addCriterion("DP_RESP_DWDZYX =", value, "dpRespDwdzyx");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzyxNotEqualTo(String value) {
            addCriterion("DP_RESP_DWDZYX <>", value, "dpRespDwdzyx");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzyxGreaterThan(String value) {
            addCriterion("DP_RESP_DWDZYX >", value, "dpRespDwdzyx");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzyxGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DWDZYX >=", value, "dpRespDwdzyx");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzyxLessThan(String value) {
            addCriterion("DP_RESP_DWDZYX <", value, "dpRespDwdzyx");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzyxLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DWDZYX <=", value, "dpRespDwdzyx");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzyxLike(String value) {
            addCriterion("DP_RESP_DWDZYX like", value, "dpRespDwdzyx");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzyxNotLike(String value) {
            addCriterion("DP_RESP_DWDZYX not like", value, "dpRespDwdzyx");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzyxIn(List<String> values) {
            addCriterion("DP_RESP_DWDZYX in", values, "dpRespDwdzyx");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzyxNotIn(List<String> values) {
            addCriterion("DP_RESP_DWDZYX not in", values, "dpRespDwdzyx");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzyxBetween(String value1, String value2) {
            addCriterion("DP_RESP_DWDZYX between", value1, value2, "dpRespDwdzyx");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzyxNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_DWDZYX not between", value1, value2, "dpRespDwdzyx");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrIsNull() {
            addCriterion("DP_RESP_AQGLR is null");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrIsNotNull() {
            addCriterion("DP_RESP_AQGLR is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrEqualTo(String value) {
            addCriterion("DP_RESP_AQGLR =", value, "dpRespAqglr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrNotEqualTo(String value) {
            addCriterion("DP_RESP_AQGLR <>", value, "dpRespAqglr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrGreaterThan(String value) {
            addCriterion("DP_RESP_AQGLR >", value, "dpRespAqglr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_AQGLR >=", value, "dpRespAqglr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrLessThan(String value) {
            addCriterion("DP_RESP_AQGLR <", value, "dpRespAqglr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_AQGLR <=", value, "dpRespAqglr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrLike(String value) {
            addCriterion("DP_RESP_AQGLR like", value, "dpRespAqglr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrNotLike(String value) {
            addCriterion("DP_RESP_AQGLR not like", value, "dpRespAqglr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrIn(List<String> values) {
            addCriterion("DP_RESP_AQGLR in", values, "dpRespAqglr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrNotIn(List<String> values) {
            addCriterion("DP_RESP_AQGLR not in", values, "dpRespAqglr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrBetween(String value1, String value2) {
            addCriterion("DP_RESP_AQGLR between", value1, value2, "dpRespAqglr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_AQGLR not between", value1, value2, "dpRespAqglr");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrdhIsNull() {
            addCriterion("DP_RESP_AQGLRDH is null");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrdhIsNotNull() {
            addCriterion("DP_RESP_AQGLRDH is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrdhEqualTo(String value) {
            addCriterion("DP_RESP_AQGLRDH =", value, "dpRespAqglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrdhNotEqualTo(String value) {
            addCriterion("DP_RESP_AQGLRDH <>", value, "dpRespAqglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrdhGreaterThan(String value) {
            addCriterion("DP_RESP_AQGLRDH >", value, "dpRespAqglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrdhGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_AQGLRDH >=", value, "dpRespAqglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrdhLessThan(String value) {
            addCriterion("DP_RESP_AQGLRDH <", value, "dpRespAqglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrdhLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_AQGLRDH <=", value, "dpRespAqglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrdhLike(String value) {
            addCriterion("DP_RESP_AQGLRDH like", value, "dpRespAqglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrdhNotLike(String value) {
            addCriterion("DP_RESP_AQGLRDH not like", value, "dpRespAqglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrdhIn(List<String> values) {
            addCriterion("DP_RESP_AQGLRDH in", values, "dpRespAqglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrdhNotIn(List<String> values) {
            addCriterion("DP_RESP_AQGLRDH not in", values, "dpRespAqglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrdhBetween(String value1, String value2) {
            addCriterion("DP_RESP_AQGLRDH between", value1, value2, "dpRespAqglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespAqglrdhNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_AQGLRDH not between", value1, value2, "dpRespAqglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrIsNull() {
            addCriterion("DP_RESP_ZJZXFGLR is null");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrIsNotNull() {
            addCriterion("DP_RESP_ZJZXFGLR is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrEqualTo(String value) {
            addCriterion("DP_RESP_ZJZXFGLR =", value, "dpRespZjzxfglr");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrNotEqualTo(String value) {
            addCriterion("DP_RESP_ZJZXFGLR <>", value, "dpRespZjzxfglr");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrGreaterThan(String value) {
            addCriterion("DP_RESP_ZJZXFGLR >", value, "dpRespZjzxfglr");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_ZJZXFGLR >=", value, "dpRespZjzxfglr");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrLessThan(String value) {
            addCriterion("DP_RESP_ZJZXFGLR <", value, "dpRespZjzxfglr");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_ZJZXFGLR <=", value, "dpRespZjzxfglr");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrLike(String value) {
            addCriterion("DP_RESP_ZJZXFGLR like", value, "dpRespZjzxfglr");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrNotLike(String value) {
            addCriterion("DP_RESP_ZJZXFGLR not like", value, "dpRespZjzxfglr");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrIn(List<String> values) {
            addCriterion("DP_RESP_ZJZXFGLR in", values, "dpRespZjzxfglr");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrNotIn(List<String> values) {
            addCriterion("DP_RESP_ZJZXFGLR not in", values, "dpRespZjzxfglr");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrBetween(String value1, String value2) {
            addCriterion("DP_RESP_ZJZXFGLR between", value1, value2, "dpRespZjzxfglr");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_ZJZXFGLR not between", value1, value2, "dpRespZjzxfglr");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrdhIsNull() {
            addCriterion("DP_RESP_ZJZXFGLRDH is null");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrdhIsNotNull() {
            addCriterion("DP_RESP_ZJZXFGLRDH is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrdhEqualTo(String value) {
            addCriterion("DP_RESP_ZJZXFGLRDH =", value, "dpRespZjzxfglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrdhNotEqualTo(String value) {
            addCriterion("DP_RESP_ZJZXFGLRDH <>", value, "dpRespZjzxfglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrdhGreaterThan(String value) {
            addCriterion("DP_RESP_ZJZXFGLRDH >", value, "dpRespZjzxfglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrdhGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_ZJZXFGLRDH >=", value, "dpRespZjzxfglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrdhLessThan(String value) {
            addCriterion("DP_RESP_ZJZXFGLRDH <", value, "dpRespZjzxfglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrdhLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_ZJZXFGLRDH <=", value, "dpRespZjzxfglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrdhLike(String value) {
            addCriterion("DP_RESP_ZJZXFGLRDH like", value, "dpRespZjzxfglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrdhNotLike(String value) {
            addCriterion("DP_RESP_ZJZXFGLRDH not like", value, "dpRespZjzxfglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrdhIn(List<String> values) {
            addCriterion("DP_RESP_ZJZXFGLRDH in", values, "dpRespZjzxfglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrdhNotIn(List<String> values) {
            addCriterion("DP_RESP_ZJZXFGLRDH not in", values, "dpRespZjzxfglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrdhBetween(String value1, String value2) {
            addCriterion("DP_RESP_ZJZXFGLRDH between", value1, value2, "dpRespZjzxfglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespZjzxfglrdhNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_ZJZXFGLRDH not between", value1, value2, "dpRespZjzxfglrdh");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzIsNull() {
            addCriterion("DP_RESP_DWDZ is null");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzIsNotNull() {
            addCriterion("DP_RESP_DWDZ is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzEqualTo(String value) {
            addCriterion("DP_RESP_DWDZ =", value, "dpRespDwdz");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzNotEqualTo(String value) {
            addCriterion("DP_RESP_DWDZ <>", value, "dpRespDwdz");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzGreaterThan(String value) {
            addCriterion("DP_RESP_DWDZ >", value, "dpRespDwdz");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DWDZ >=", value, "dpRespDwdz");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzLessThan(String value) {
            addCriterion("DP_RESP_DWDZ <", value, "dpRespDwdz");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DWDZ <=", value, "dpRespDwdz");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzLike(String value) {
            addCriterion("DP_RESP_DWDZ like", value, "dpRespDwdz");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzNotLike(String value) {
            addCriterion("DP_RESP_DWDZ not like", value, "dpRespDwdz");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzIn(List<String> values) {
            addCriterion("DP_RESP_DWDZ in", values, "dpRespDwdz");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzNotIn(List<String> values) {
            addCriterion("DP_RESP_DWDZ not in", values, "dpRespDwdz");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzBetween(String value1, String value2) {
            addCriterion("DP_RESP_DWDZ between", value1, value2, "dpRespDwdz");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdzNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_DWDZ not between", value1, value2, "dpRespDwdz");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdhIsNull() {
            addCriterion("DP_RESP_DWDH is null");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdhIsNotNull() {
            addCriterion("DP_RESP_DWDH is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdhEqualTo(String value) {
            addCriterion("DP_RESP_DWDH =", value, "dpRespDwdh");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdhNotEqualTo(String value) {
            addCriterion("DP_RESP_DWDH <>", value, "dpRespDwdh");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdhGreaterThan(String value) {
            addCriterion("DP_RESP_DWDH >", value, "dpRespDwdh");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdhGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DWDH >=", value, "dpRespDwdh");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdhLessThan(String value) {
            addCriterion("DP_RESP_DWDH <", value, "dpRespDwdh");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdhLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DWDH <=", value, "dpRespDwdh");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdhLike(String value) {
            addCriterion("DP_RESP_DWDH like", value, "dpRespDwdh");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdhNotLike(String value) {
            addCriterion("DP_RESP_DWDH not like", value, "dpRespDwdh");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdhIn(List<String> values) {
            addCriterion("DP_RESP_DWDH in", values, "dpRespDwdh");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdhNotIn(List<String> values) {
            addCriterion("DP_RESP_DWDH not in", values, "dpRespDwdh");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdhBetween(String value1, String value2) {
            addCriterion("DP_RESP_DWDH between", value1, value2, "dpRespDwdh");
            return (Criteria) this;
        }

        public Criteria andDpRespDwdhNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_DWDH not between", value1, value2, "dpRespDwdh");
            return (Criteria) this;
        }

        public Criteria andDpRespDlwzIsNull() {
            addCriterion("DP_RESP_DLWZ is null");
            return (Criteria) this;
        }

        public Criteria andDpRespDlwzIsNotNull() {
            addCriterion("DP_RESP_DLWZ is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespDlwzEqualTo(String value) {
            addCriterion("DP_RESP_DLWZ =", value, "dpRespDlwz");
            return (Criteria) this;
        }

        public Criteria andDpRespDlwzNotEqualTo(String value) {
            addCriterion("DP_RESP_DLWZ <>", value, "dpRespDlwz");
            return (Criteria) this;
        }

        public Criteria andDpRespDlwzGreaterThan(String value) {
            addCriterion("DP_RESP_DLWZ >", value, "dpRespDlwz");
            return (Criteria) this;
        }

        public Criteria andDpRespDlwzGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DLWZ >=", value, "dpRespDlwz");
            return (Criteria) this;
        }

        public Criteria andDpRespDlwzLessThan(String value) {
            addCriterion("DP_RESP_DLWZ <", value, "dpRespDlwz");
            return (Criteria) this;
        }

        public Criteria andDpRespDlwzLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DLWZ <=", value, "dpRespDlwz");
            return (Criteria) this;
        }

        public Criteria andDpRespDlwzLike(String value) {
            addCriterion("DP_RESP_DLWZ like", value, "dpRespDlwz");
            return (Criteria) this;
        }

        public Criteria andDpRespDlwzNotLike(String value) {
            addCriterion("DP_RESP_DLWZ not like", value, "dpRespDlwz");
            return (Criteria) this;
        }

        public Criteria andDpRespDlwzIn(List<String> values) {
            addCriterion("DP_RESP_DLWZ in", values, "dpRespDlwz");
            return (Criteria) this;
        }

        public Criteria andDpRespDlwzNotIn(List<String> values) {
            addCriterion("DP_RESP_DLWZ not in", values, "dpRespDlwz");
            return (Criteria) this;
        }

        public Criteria andDpRespDlwzBetween(String value1, String value2) {
            addCriterion("DP_RESP_DLWZ between", value1, value2, "dpRespDlwz");
            return (Criteria) this;
        }

        public Criteria andDpRespDlwzNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_DLWZ not between", value1, value2, "dpRespDlwz");
            return (Criteria) this;
        }

        public Criteria andDpRespDwlbIsNull() {
            addCriterion("DP_RESP_DWLB is null");
            return (Criteria) this;
        }

        public Criteria andDpRespDwlbIsNotNull() {
            addCriterion("DP_RESP_DWLB is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespDwlbEqualTo(String value) {
            addCriterion("DP_RESP_DWLB =", value, "dpRespDwlb");
            return (Criteria) this;
        }

        public Criteria andDpRespDwlbNotEqualTo(String value) {
            addCriterion("DP_RESP_DWLB <>", value, "dpRespDwlb");
            return (Criteria) this;
        }

        public Criteria andDpRespDwlbGreaterThan(String value) {
            addCriterion("DP_RESP_DWLB >", value, "dpRespDwlb");
            return (Criteria) this;
        }

        public Criteria andDpRespDwlbGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DWLB >=", value, "dpRespDwlb");
            return (Criteria) this;
        }

        public Criteria andDpRespDwlbLessThan(String value) {
            addCriterion("DP_RESP_DWLB <", value, "dpRespDwlb");
            return (Criteria) this;
        }

        public Criteria andDpRespDwlbLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DWLB <=", value, "dpRespDwlb");
            return (Criteria) this;
        }

        public Criteria andDpRespDwlbLike(String value) {
            addCriterion("DP_RESP_DWLB like", value, "dpRespDwlb");
            return (Criteria) this;
        }

        public Criteria andDpRespDwlbNotLike(String value) {
            addCriterion("DP_RESP_DWLB not like", value, "dpRespDwlb");
            return (Criteria) this;
        }

        public Criteria andDpRespDwlbIn(List<String> values) {
            addCriterion("DP_RESP_DWLB in", values, "dpRespDwlb");
            return (Criteria) this;
        }

        public Criteria andDpRespDwlbNotIn(List<String> values) {
            addCriterion("DP_RESP_DWLB not in", values, "dpRespDwlb");
            return (Criteria) this;
        }

        public Criteria andDpRespDwlbBetween(String value1, String value2) {
            addCriterion("DP_RESP_DWLB between", value1, value2, "dpRespDwlb");
            return (Criteria) this;
        }

        public Criteria andDpRespDwlbNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_DWLB not between", value1, value2, "dpRespDwlb");
            return (Criteria) this;
        }

        public Criteria andDpRespBzIsNull() {
            addCriterion("DP_RESP_BZ is null");
            return (Criteria) this;
        }

        public Criteria andDpRespBzIsNotNull() {
            addCriterion("DP_RESP_BZ is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespBzEqualTo(String value) {
            addCriterion("DP_RESP_BZ =", value, "dpRespBz");
            return (Criteria) this;
        }

        public Criteria andDpRespBzNotEqualTo(String value) {
            addCriterion("DP_RESP_BZ <>", value, "dpRespBz");
            return (Criteria) this;
        }

        public Criteria andDpRespBzGreaterThan(String value) {
            addCriterion("DP_RESP_BZ >", value, "dpRespBz");
            return (Criteria) this;
        }

        public Criteria andDpRespBzGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_BZ >=", value, "dpRespBz");
            return (Criteria) this;
        }

        public Criteria andDpRespBzLessThan(String value) {
            addCriterion("DP_RESP_BZ <", value, "dpRespBz");
            return (Criteria) this;
        }

        public Criteria andDpRespBzLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_BZ <=", value, "dpRespBz");
            return (Criteria) this;
        }

        public Criteria andDpRespBzLike(String value) {
            addCriterion("DP_RESP_BZ like", value, "dpRespBz");
            return (Criteria) this;
        }

        public Criteria andDpRespBzNotLike(String value) {
            addCriterion("DP_RESP_BZ not like", value, "dpRespBz");
            return (Criteria) this;
        }

        public Criteria andDpRespBzIn(List<String> values) {
            addCriterion("DP_RESP_BZ in", values, "dpRespBz");
            return (Criteria) this;
        }

        public Criteria andDpRespBzNotIn(List<String> values) {
            addCriterion("DP_RESP_BZ not in", values, "dpRespBz");
            return (Criteria) this;
        }

        public Criteria andDpRespBzBetween(String value1, String value2) {
            addCriterion("DP_RESP_BZ between", value1, value2, "dpRespBz");
            return (Criteria) this;
        }

        public Criteria andDpRespBzNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_BZ not between", value1, value2, "dpRespBz");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXIsNull() {
            addCriterion("DP_RESP_GIS_X is null");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXIsNotNull() {
            addCriterion("DP_RESP_GIS_X is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXEqualTo(String value) {
            addCriterion("DP_RESP_GIS_X =", value, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXNotEqualTo(String value) {
            addCriterion("DP_RESP_GIS_X <>", value, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXGreaterThan(String value) {
            addCriterion("DP_RESP_GIS_X >", value, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_GIS_X >=", value, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXLessThan(String value) {
            addCriterion("DP_RESP_GIS_X <", value, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_GIS_X <=", value, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXLike(String value) {
            addCriterion("DP_RESP_GIS_X like", value, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXNotLike(String value) {
            addCriterion("DP_RESP_GIS_X not like", value, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXIn(List<String> values) {
            addCriterion("DP_RESP_GIS_X in", values, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXNotIn(List<String> values) {
            addCriterion("DP_RESP_GIS_X not in", values, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXBetween(String value1, String value2) {
            addCriterion("DP_RESP_GIS_X between", value1, value2, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_GIS_X not between", value1, value2, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYIsNull() {
            addCriterion("DP_RESP_GIS_Y is null");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYIsNotNull() {
            addCriterion("DP_RESP_GIS_Y is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYEqualTo(String value) {
            addCriterion("DP_RESP_GIS_Y =", value, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYNotEqualTo(String value) {
            addCriterion("DP_RESP_GIS_Y <>", value, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYGreaterThan(String value) {
            addCriterion("DP_RESP_GIS_Y >", value, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_GIS_Y >=", value, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYLessThan(String value) {
            addCriterion("DP_RESP_GIS_Y <", value, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_GIS_Y <=", value, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYLike(String value) {
            addCriterion("DP_RESP_GIS_Y like", value, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYNotLike(String value) {
            addCriterion("DP_RESP_GIS_Y not like", value, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYIn(List<String> values) {
            addCriterion("DP_RESP_GIS_Y in", values, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYNotIn(List<String> values) {
            addCriterion("DP_RESP_GIS_Y not in", values, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYBetween(String value1, String value2) {
            addCriterion("DP_RESP_GIS_Y between", value1, value2, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_GIS_Y not between", value1, value2, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidIsNull() {
            addCriterion("DP_RESP_DETACHMENTID is null");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidIsNotNull() {
            addCriterion("DP_RESP_DETACHMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidEqualTo(String value) {
            addCriterion("DP_RESP_DETACHMENTID =", value, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidNotEqualTo(String value) {
            addCriterion("DP_RESP_DETACHMENTID <>", value, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidGreaterThan(String value) {
            addCriterion("DP_RESP_DETACHMENTID >", value, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DETACHMENTID >=", value, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidLessThan(String value) {
            addCriterion("DP_RESP_DETACHMENTID <", value, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DETACHMENTID <=", value, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidLike(String value) {
            addCriterion("DP_RESP_DETACHMENTID like", value, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidNotLike(String value) {
            addCriterion("DP_RESP_DETACHMENTID not like", value, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidIn(List<String> values) {
            addCriterion("DP_RESP_DETACHMENTID in", values, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidNotIn(List<String> values) {
            addCriterion("DP_RESP_DETACHMENTID not in", values, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidBetween(String value1, String value2) {
            addCriterion("DP_RESP_DETACHMENTID between", value1, value2, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_DETACHMENTID not between", value1, value2, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespHgyqIsNull() {
            addCriterion("DP_RESP_HGYQ is null");
            return (Criteria) this;
        }

        public Criteria andDpRespHgyqIsNotNull() {
            addCriterion("DP_RESP_HGYQ is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespHgyqEqualTo(String value) {
            addCriterion("DP_RESP_HGYQ =", value, "dpRespHgyq");
            return (Criteria) this;
        }

        public Criteria andDpRespHgyqNotEqualTo(String value) {
            addCriterion("DP_RESP_HGYQ <>", value, "dpRespHgyq");
            return (Criteria) this;
        }

        public Criteria andDpRespHgyqGreaterThan(String value) {
            addCriterion("DP_RESP_HGYQ >", value, "dpRespHgyq");
            return (Criteria) this;
        }

        public Criteria andDpRespHgyqGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_HGYQ >=", value, "dpRespHgyq");
            return (Criteria) this;
        }

        public Criteria andDpRespHgyqLessThan(String value) {
            addCriterion("DP_RESP_HGYQ <", value, "dpRespHgyq");
            return (Criteria) this;
        }

        public Criteria andDpRespHgyqLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_HGYQ <=", value, "dpRespHgyq");
            return (Criteria) this;
        }

        public Criteria andDpRespHgyqLike(String value) {
            addCriterion("DP_RESP_HGYQ like", value, "dpRespHgyq");
            return (Criteria) this;
        }

        public Criteria andDpRespHgyqNotLike(String value) {
            addCriterion("DP_RESP_HGYQ not like", value, "dpRespHgyq");
            return (Criteria) this;
        }

        public Criteria andDpRespHgyqIn(List<String> values) {
            addCriterion("DP_RESP_HGYQ in", values, "dpRespHgyq");
            return (Criteria) this;
        }

        public Criteria andDpRespHgyqNotIn(List<String> values) {
            addCriterion("DP_RESP_HGYQ not in", values, "dpRespHgyq");
            return (Criteria) this;
        }

        public Criteria andDpRespHgyqBetween(String value1, String value2) {
            addCriterion("DP_RESP_HGYQ between", value1, value2, "dpRespHgyq");
            return (Criteria) this;
        }

        public Criteria andDpRespHgyqNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_HGYQ not between", value1, value2, "dpRespHgyq");
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