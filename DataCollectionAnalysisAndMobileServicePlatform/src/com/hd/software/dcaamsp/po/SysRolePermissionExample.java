package com.hd.software.dcaamsp.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysRolePermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysRolePermissionExample() {
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

        public Criteria andDpRespRoleidIsNull() {
            addCriterion("DP_RESP_ROLEID is null");
            return (Criteria) this;
        }

        public Criteria andDpRespRoleidIsNotNull() {
            addCriterion("DP_RESP_ROLEID is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespRoleidEqualTo(Object value) {
            addCriterion("DP_RESP_ROLEID =", value, "dpRespRoleid");
            return (Criteria) this;
        }

        public Criteria andDpRespRoleidNotEqualTo(Object value) {
            addCriterion("DP_RESP_ROLEID <>", value, "dpRespRoleid");
            return (Criteria) this;
        }

        public Criteria andDpRespRoleidGreaterThan(Object value) {
            addCriterion("DP_RESP_ROLEID >", value, "dpRespRoleid");
            return (Criteria) this;
        }

        public Criteria andDpRespRoleidGreaterThanOrEqualTo(Object value) {
            addCriterion("DP_RESP_ROLEID >=", value, "dpRespRoleid");
            return (Criteria) this;
        }

        public Criteria andDpRespRoleidLessThan(Object value) {
            addCriterion("DP_RESP_ROLEID <", value, "dpRespRoleid");
            return (Criteria) this;
        }

        public Criteria andDpRespRoleidLessThanOrEqualTo(Object value) {
            addCriterion("DP_RESP_ROLEID <=", value, "dpRespRoleid");
            return (Criteria) this;
        }

        public Criteria andDpRespRoleidIn(List<Object> values) {
            addCriterion("DP_RESP_ROLEID in", values, "dpRespRoleid");
            return (Criteria) this;
        }

        public Criteria andDpRespRoleidNotIn(List<Object> values) {
            addCriterion("DP_RESP_ROLEID not in", values, "dpRespRoleid");
            return (Criteria) this;
        }

        public Criteria andDpRespRoleidBetween(Object value1, Object value2) {
            addCriterion("DP_RESP_ROLEID between", value1, value2, "dpRespRoleid");
            return (Criteria) this;
        }

        public Criteria andDpRespRoleidNotBetween(Object value1, Object value2) {
            addCriterion("DP_RESP_ROLEID not between", value1, value2, "dpRespRoleid");
            return (Criteria) this;
        }

        public Criteria andDpRespPermissionidIsNull() {
            addCriterion("DP_RESP_PERMISSIONID is null");
            return (Criteria) this;
        }

        public Criteria andDpRespPermissionidIsNotNull() {
            addCriterion("DP_RESP_PERMISSIONID is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespPermissionidEqualTo(Object value) {
            addCriterion("DP_RESP_PERMISSIONID =", value, "dpRespPermissionid");
            return (Criteria) this;
        }

        public Criteria andDpRespPermissionidNotEqualTo(Object value) {
            addCriterion("DP_RESP_PERMISSIONID <>", value, "dpRespPermissionid");
            return (Criteria) this;
        }

        public Criteria andDpRespPermissionidGreaterThan(Object value) {
            addCriterion("DP_RESP_PERMISSIONID >", value, "dpRespPermissionid");
            return (Criteria) this;
        }

        public Criteria andDpRespPermissionidGreaterThanOrEqualTo(Object value) {
            addCriterion("DP_RESP_PERMISSIONID >=", value, "dpRespPermissionid");
            return (Criteria) this;
        }

        public Criteria andDpRespPermissionidLessThan(Object value) {
            addCriterion("DP_RESP_PERMISSIONID <", value, "dpRespPermissionid");
            return (Criteria) this;
        }

        public Criteria andDpRespPermissionidLessThanOrEqualTo(Object value) {
            addCriterion("DP_RESP_PERMISSIONID <=", value, "dpRespPermissionid");
            return (Criteria) this;
        }

        public Criteria andDpRespPermissionidIn(List<Object> values) {
            addCriterion("DP_RESP_PERMISSIONID in", values, "dpRespPermissionid");
            return (Criteria) this;
        }

        public Criteria andDpRespPermissionidNotIn(List<Object> values) {
            addCriterion("DP_RESP_PERMISSIONID not in", values, "dpRespPermissionid");
            return (Criteria) this;
        }

        public Criteria andDpRespPermissionidBetween(Object value1, Object value2) {
            addCriterion("DP_RESP_PERMISSIONID between", value1, value2, "dpRespPermissionid");
            return (Criteria) this;
        }

        public Criteria andDpRespPermissionidNotBetween(Object value1, Object value2) {
            addCriterion("DP_RESP_PERMISSIONID not between", value1, value2, "dpRespPermissionid");
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