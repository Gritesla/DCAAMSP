package com.hd.software.dcaamsp.po;

import java.util.ArrayList;
import java.util.List;

public class DpSmallplacesDeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DpSmallplacesDeviceExample() {
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

        public Criteria andDpRespUnitcodeIsNull() {
            addCriterion("DP_RESP_UNITCODE is null");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeIsNotNull() {
            addCriterion("DP_RESP_UNITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeEqualTo(String value) {
            addCriterion("DP_RESP_UNITCODE =", value, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeNotEqualTo(String value) {
            addCriterion("DP_RESP_UNITCODE <>", value, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeGreaterThan(String value) {
            addCriterion("DP_RESP_UNITCODE >", value, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_UNITCODE >=", value, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeLessThan(String value) {
            addCriterion("DP_RESP_UNITCODE <", value, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_UNITCODE <=", value, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeLike(String value) {
            addCriterion("DP_RESP_UNITCODE like", value, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeNotLike(String value) {
            addCriterion("DP_RESP_UNITCODE not like", value, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeIn(List<String> values) {
            addCriterion("DP_RESP_UNITCODE in", values, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeNotIn(List<String> values) {
            addCriterion("DP_RESP_UNITCODE not in", values, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeBetween(String value1, String value2) {
            addCriterion("DP_RESP_UNITCODE between", value1, value2, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_UNITCODE not between", value1, value2, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespDeviceidIsNull() {
            addCriterion("DP_RESP_DEVICEID is null");
            return (Criteria) this;
        }

        public Criteria andDpRespDeviceidIsNotNull() {
            addCriterion("DP_RESP_DEVICEID is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespDeviceidEqualTo(String value) {
            addCriterion("DP_RESP_DEVICEID =", value, "dpRespDeviceid");
            return (Criteria) this;
        }

        public Criteria andDpRespDeviceidNotEqualTo(String value) {
            addCriterion("DP_RESP_DEVICEID <>", value, "dpRespDeviceid");
            return (Criteria) this;
        }

        public Criteria andDpRespDeviceidGreaterThan(String value) {
            addCriterion("DP_RESP_DEVICEID >", value, "dpRespDeviceid");
            return (Criteria) this;
        }

        public Criteria andDpRespDeviceidGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DEVICEID >=", value, "dpRespDeviceid");
            return (Criteria) this;
        }

        public Criteria andDpRespDeviceidLessThan(String value) {
            addCriterion("DP_RESP_DEVICEID <", value, "dpRespDeviceid");
            return (Criteria) this;
        }

        public Criteria andDpRespDeviceidLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DEVICEID <=", value, "dpRespDeviceid");
            return (Criteria) this;
        }

        public Criteria andDpRespDeviceidLike(String value) {
            addCriterion("DP_RESP_DEVICEID like", value, "dpRespDeviceid");
            return (Criteria) this;
        }

        public Criteria andDpRespDeviceidNotLike(String value) {
            addCriterion("DP_RESP_DEVICEID not like", value, "dpRespDeviceid");
            return (Criteria) this;
        }

        public Criteria andDpRespDeviceidIn(List<String> values) {
            addCriterion("DP_RESP_DEVICEID in", values, "dpRespDeviceid");
            return (Criteria) this;
        }

        public Criteria andDpRespDeviceidNotIn(List<String> values) {
            addCriterion("DP_RESP_DEVICEID not in", values, "dpRespDeviceid");
            return (Criteria) this;
        }

        public Criteria andDpRespDeviceidBetween(String value1, String value2) {
            addCriterion("DP_RESP_DEVICEID between", value1, value2, "dpRespDeviceid");
            return (Criteria) this;
        }

        public Criteria andDpRespDeviceidNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_DEVICEID not between", value1, value2, "dpRespDeviceid");
            return (Criteria) this;
        }

        public Criteria andDpRespLayerIsNull() {
            addCriterion("DP_RESP_LAYER is null");
            return (Criteria) this;
        }

        public Criteria andDpRespLayerIsNotNull() {
            addCriterion("DP_RESP_LAYER is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespLayerEqualTo(String value) {
            addCriterion("DP_RESP_LAYER =", value, "dpRespLayer");
            return (Criteria) this;
        }

        public Criteria andDpRespLayerNotEqualTo(String value) {
            addCriterion("DP_RESP_LAYER <>", value, "dpRespLayer");
            return (Criteria) this;
        }

        public Criteria andDpRespLayerGreaterThan(String value) {
            addCriterion("DP_RESP_LAYER >", value, "dpRespLayer");
            return (Criteria) this;
        }

        public Criteria andDpRespLayerGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_LAYER >=", value, "dpRespLayer");
            return (Criteria) this;
        }

        public Criteria andDpRespLayerLessThan(String value) {
            addCriterion("DP_RESP_LAYER <", value, "dpRespLayer");
            return (Criteria) this;
        }

        public Criteria andDpRespLayerLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_LAYER <=", value, "dpRespLayer");
            return (Criteria) this;
        }

        public Criteria andDpRespLayerLike(String value) {
            addCriterion("DP_RESP_LAYER like", value, "dpRespLayer");
            return (Criteria) this;
        }

        public Criteria andDpRespLayerNotLike(String value) {
            addCriterion("DP_RESP_LAYER not like", value, "dpRespLayer");
            return (Criteria) this;
        }

        public Criteria andDpRespLayerIn(List<String> values) {
            addCriterion("DP_RESP_LAYER in", values, "dpRespLayer");
            return (Criteria) this;
        }

        public Criteria andDpRespLayerNotIn(List<String> values) {
            addCriterion("DP_RESP_LAYER not in", values, "dpRespLayer");
            return (Criteria) this;
        }

        public Criteria andDpRespLayerBetween(String value1, String value2) {
            addCriterion("DP_RESP_LAYER between", value1, value2, "dpRespLayer");
            return (Criteria) this;
        }

        public Criteria andDpRespLayerNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_LAYER not between", value1, value2, "dpRespLayer");
            return (Criteria) this;
        }

        public Criteria andDpRespDoornumberIsNull() {
            addCriterion("DP_RESP_DOORNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andDpRespDoornumberIsNotNull() {
            addCriterion("DP_RESP_DOORNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespDoornumberEqualTo(String value) {
            addCriterion("DP_RESP_DOORNUMBER =", value, "dpRespDoornumber");
            return (Criteria) this;
        }

        public Criteria andDpRespDoornumberNotEqualTo(String value) {
            addCriterion("DP_RESP_DOORNUMBER <>", value, "dpRespDoornumber");
            return (Criteria) this;
        }

        public Criteria andDpRespDoornumberGreaterThan(String value) {
            addCriterion("DP_RESP_DOORNUMBER >", value, "dpRespDoornumber");
            return (Criteria) this;
        }

        public Criteria andDpRespDoornumberGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DOORNUMBER >=", value, "dpRespDoornumber");
            return (Criteria) this;
        }

        public Criteria andDpRespDoornumberLessThan(String value) {
            addCriterion("DP_RESP_DOORNUMBER <", value, "dpRespDoornumber");
            return (Criteria) this;
        }

        public Criteria andDpRespDoornumberLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DOORNUMBER <=", value, "dpRespDoornumber");
            return (Criteria) this;
        }

        public Criteria andDpRespDoornumberLike(String value) {
            addCriterion("DP_RESP_DOORNUMBER like", value, "dpRespDoornumber");
            return (Criteria) this;
        }

        public Criteria andDpRespDoornumberNotLike(String value) {
            addCriterion("DP_RESP_DOORNUMBER not like", value, "dpRespDoornumber");
            return (Criteria) this;
        }

        public Criteria andDpRespDoornumberIn(List<String> values) {
            addCriterion("DP_RESP_DOORNUMBER in", values, "dpRespDoornumber");
            return (Criteria) this;
        }

        public Criteria andDpRespDoornumberNotIn(List<String> values) {
            addCriterion("DP_RESP_DOORNUMBER not in", values, "dpRespDoornumber");
            return (Criteria) this;
        }

        public Criteria andDpRespDoornumberBetween(String value1, String value2) {
            addCriterion("DP_RESP_DOORNUMBER between", value1, value2, "dpRespDoornumber");
            return (Criteria) this;
        }

        public Criteria andDpRespDoornumberNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_DOORNUMBER not between", value1, value2, "dpRespDoornumber");
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