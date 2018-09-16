package com.hd.software.dcaamsp.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysRoleExample() {
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

        public Criteria andDpRespRoleidIsNull() {
            addCriterion("DP_RESP_ROLEID is null");
            return (Criteria) this;
        }

        public Criteria andDpRespRoleidIsNotNull() {
            addCriterion("DP_RESP_ROLEID is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespRoleidEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_ROLEID =", value, "dpRespRoleid");
            return (Criteria) this;
        }

        public Criteria andDpRespRoleidNotEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_ROLEID <>", value, "dpRespRoleid");
            return (Criteria) this;
        }

        public Criteria andDpRespRoleidGreaterThan(BigDecimal value) {
            addCriterion("DP_RESP_ROLEID >", value, "dpRespRoleid");
            return (Criteria) this;
        }

        public Criteria andDpRespRoleidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_ROLEID >=", value, "dpRespRoleid");
            return (Criteria) this;
        }

        public Criteria andDpRespRoleidLessThan(BigDecimal value) {
            addCriterion("DP_RESP_ROLEID <", value, "dpRespRoleid");
            return (Criteria) this;
        }

        public Criteria andDpRespRoleidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_ROLEID <=", value, "dpRespRoleid");
            return (Criteria) this;
        }

        public Criteria andDpRespRoleidIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_ROLEID in", values, "dpRespRoleid");
            return (Criteria) this;
        }

        public Criteria andDpRespRoleidNotIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_ROLEID not in", values, "dpRespRoleid");
            return (Criteria) this;
        }

        public Criteria andDpRespRoleidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_ROLEID between", value1, value2, "dpRespRoleid");
            return (Criteria) this;
        }

        public Criteria andDpRespRoleidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_ROLEID not between", value1, value2, "dpRespRoleid");
            return (Criteria) this;
        }

        public Criteria andDpRespNameIsNull() {
            addCriterion("DP_RESP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDpRespNameIsNotNull() {
            addCriterion("DP_RESP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespNameEqualTo(String value) {
            addCriterion("DP_RESP_NAME =", value, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespNameNotEqualTo(String value) {
            addCriterion("DP_RESP_NAME <>", value, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespNameGreaterThan(String value) {
            addCriterion("DP_RESP_NAME >", value, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespNameGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_NAME >=", value, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespNameLessThan(String value) {
            addCriterion("DP_RESP_NAME <", value, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespNameLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_NAME <=", value, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespNameLike(String value) {
            addCriterion("DP_RESP_NAME like", value, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespNameNotLike(String value) {
            addCriterion("DP_RESP_NAME not like", value, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespNameIn(List<String> values) {
            addCriterion("DP_RESP_NAME in", values, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespNameNotIn(List<String> values) {
            addCriterion("DP_RESP_NAME not in", values, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespNameBetween(String value1, String value2) {
            addCriterion("DP_RESP_NAME between", value1, value2, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespNameNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_NAME not between", value1, value2, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespAvailableIsNull() {
            addCriterion("DP_RESP_AVAILABLE is null");
            return (Criteria) this;
        }

        public Criteria andDpRespAvailableIsNotNull() {
            addCriterion("DP_RESP_AVAILABLE is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespAvailableEqualTo(String value) {
            addCriterion("DP_RESP_AVAILABLE =", value, "dpRespAvailable");
            return (Criteria) this;
        }

        public Criteria andDpRespAvailableNotEqualTo(String value) {
            addCriterion("DP_RESP_AVAILABLE <>", value, "dpRespAvailable");
            return (Criteria) this;
        }

        public Criteria andDpRespAvailableGreaterThan(String value) {
            addCriterion("DP_RESP_AVAILABLE >", value, "dpRespAvailable");
            return (Criteria) this;
        }

        public Criteria andDpRespAvailableGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_AVAILABLE >=", value, "dpRespAvailable");
            return (Criteria) this;
        }

        public Criteria andDpRespAvailableLessThan(String value) {
            addCriterion("DP_RESP_AVAILABLE <", value, "dpRespAvailable");
            return (Criteria) this;
        }

        public Criteria andDpRespAvailableLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_AVAILABLE <=", value, "dpRespAvailable");
            return (Criteria) this;
        }

        public Criteria andDpRespAvailableLike(String value) {
            addCriterion("DP_RESP_AVAILABLE like", value, "dpRespAvailable");
            return (Criteria) this;
        }

        public Criteria andDpRespAvailableNotLike(String value) {
            addCriterion("DP_RESP_AVAILABLE not like", value, "dpRespAvailable");
            return (Criteria) this;
        }

        public Criteria andDpRespAvailableIn(List<String> values) {
            addCriterion("DP_RESP_AVAILABLE in", values, "dpRespAvailable");
            return (Criteria) this;
        }

        public Criteria andDpRespAvailableNotIn(List<String> values) {
            addCriterion("DP_RESP_AVAILABLE not in", values, "dpRespAvailable");
            return (Criteria) this;
        }

        public Criteria andDpRespAvailableBetween(String value1, String value2) {
            addCriterion("DP_RESP_AVAILABLE between", value1, value2, "dpRespAvailable");
            return (Criteria) this;
        }

        public Criteria andDpRespAvailableNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_AVAILABLE not between", value1, value2, "dpRespAvailable");
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