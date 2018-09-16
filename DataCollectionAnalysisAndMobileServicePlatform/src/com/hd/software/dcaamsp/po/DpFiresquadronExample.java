package com.hd.software.dcaamsp.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DpFiresquadronExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DpFiresquadronExample() {
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

        public Criteria andDpRespSquadronidIsNull() {
            addCriterion("DP_RESP_SQUADRONID is null");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidIsNotNull() {
            addCriterion("DP_RESP_SQUADRONID is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidEqualTo(String value) {
            addCriterion("DP_RESP_SQUADRONID =", value, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidNotEqualTo(String value) {
            addCriterion("DP_RESP_SQUADRONID <>", value, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidGreaterThan(String value) {
            addCriterion("DP_RESP_SQUADRONID >", value, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_SQUADRONID >=", value, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidLessThan(String value) {
            addCriterion("DP_RESP_SQUADRONID <", value, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_SQUADRONID <=", value, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidLike(String value) {
            addCriterion("DP_RESP_SQUADRONID like", value, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidNotLike(String value) {
            addCriterion("DP_RESP_SQUADRONID not like", value, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidIn(List<String> values) {
            addCriterion("DP_RESP_SQUADRONID in", values, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidNotIn(List<String> values) {
            addCriterion("DP_RESP_SQUADRONID not in", values, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidBetween(String value1, String value2) {
            addCriterion("DP_RESP_SQUADRONID between", value1, value2, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_SQUADRONID not between", value1, value2, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameIsNull() {
            addCriterion("DP_RESP_SQUADRONNAME is null");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameIsNotNull() {
            addCriterion("DP_RESP_SQUADRONNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameEqualTo(String value) {
            addCriterion("DP_RESP_SQUADRONNAME =", value, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameNotEqualTo(String value) {
            addCriterion("DP_RESP_SQUADRONNAME <>", value, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameGreaterThan(String value) {
            addCriterion("DP_RESP_SQUADRONNAME >", value, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_SQUADRONNAME >=", value, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameLessThan(String value) {
            addCriterion("DP_RESP_SQUADRONNAME <", value, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_SQUADRONNAME <=", value, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameLike(String value) {
            addCriterion("DP_RESP_SQUADRONNAME like", value, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameNotLike(String value) {
            addCriterion("DP_RESP_SQUADRONNAME not like", value, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameIn(List<String> values) {
            addCriterion("DP_RESP_SQUADRONNAME in", values, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameNotIn(List<String> values) {
            addCriterion("DP_RESP_SQUADRONNAME not in", values, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameBetween(String value1, String value2) {
            addCriterion("DP_RESP_SQUADRONNAME between", value1, value2, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_SQUADRONNAME not between", value1, value2, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespParentidIsNull() {
            addCriterion("DP_RESP_PARENTID is null");
            return (Criteria) this;
        }

        public Criteria andDpRespParentidIsNotNull() {
            addCriterion("DP_RESP_PARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespParentidEqualTo(String value) {
            addCriterion("DP_RESP_PARENTID =", value, "dpRespParentid");
            return (Criteria) this;
        }

        public Criteria andDpRespParentidNotEqualTo(String value) {
            addCriterion("DP_RESP_PARENTID <>", value, "dpRespParentid");
            return (Criteria) this;
        }

        public Criteria andDpRespParentidGreaterThan(String value) {
            addCriterion("DP_RESP_PARENTID >", value, "dpRespParentid");
            return (Criteria) this;
        }

        public Criteria andDpRespParentidGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_PARENTID >=", value, "dpRespParentid");
            return (Criteria) this;
        }

        public Criteria andDpRespParentidLessThan(String value) {
            addCriterion("DP_RESP_PARENTID <", value, "dpRespParentid");
            return (Criteria) this;
        }

        public Criteria andDpRespParentidLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_PARENTID <=", value, "dpRespParentid");
            return (Criteria) this;
        }

        public Criteria andDpRespParentidLike(String value) {
            addCriterion("DP_RESP_PARENTID like", value, "dpRespParentid");
            return (Criteria) this;
        }

        public Criteria andDpRespParentidNotLike(String value) {
            addCriterion("DP_RESP_PARENTID not like", value, "dpRespParentid");
            return (Criteria) this;
        }

        public Criteria andDpRespParentidIn(List<String> values) {
            addCriterion("DP_RESP_PARENTID in", values, "dpRespParentid");
            return (Criteria) this;
        }

        public Criteria andDpRespParentidNotIn(List<String> values) {
            addCriterion("DP_RESP_PARENTID not in", values, "dpRespParentid");
            return (Criteria) this;
        }

        public Criteria andDpRespParentidBetween(String value1, String value2) {
            addCriterion("DP_RESP_PARENTID between", value1, value2, "dpRespParentid");
            return (Criteria) this;
        }

        public Criteria andDpRespParentidNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_PARENTID not between", value1, value2, "dpRespParentid");
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