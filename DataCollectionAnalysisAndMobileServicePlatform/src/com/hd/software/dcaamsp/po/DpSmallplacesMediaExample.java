package com.hd.software.dcaamsp.po;

import java.util.ArrayList;
import java.util.List;

public class DpSmallplacesMediaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DpSmallplacesMediaExample() {
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

        public Criteria andDpRespMediaidIsNull() {
            addCriterion("DP_RESP_MEDIAID is null");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaidIsNotNull() {
            addCriterion("DP_RESP_MEDIAID is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaidEqualTo(String value) {
            addCriterion("DP_RESP_MEDIAID =", value, "dpRespMediaid");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaidNotEqualTo(String value) {
            addCriterion("DP_RESP_MEDIAID <>", value, "dpRespMediaid");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaidGreaterThan(String value) {
            addCriterion("DP_RESP_MEDIAID >", value, "dpRespMediaid");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaidGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_MEDIAID >=", value, "dpRespMediaid");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaidLessThan(String value) {
            addCriterion("DP_RESP_MEDIAID <", value, "dpRespMediaid");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaidLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_MEDIAID <=", value, "dpRespMediaid");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaidLike(String value) {
            addCriterion("DP_RESP_MEDIAID like", value, "dpRespMediaid");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaidNotLike(String value) {
            addCriterion("DP_RESP_MEDIAID not like", value, "dpRespMediaid");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaidIn(List<String> values) {
            addCriterion("DP_RESP_MEDIAID in", values, "dpRespMediaid");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaidNotIn(List<String> values) {
            addCriterion("DP_RESP_MEDIAID not in", values, "dpRespMediaid");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaidBetween(String value1, String value2) {
            addCriterion("DP_RESP_MEDIAID between", value1, value2, "dpRespMediaid");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaidNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_MEDIAID not between", value1, value2, "dpRespMediaid");
            return (Criteria) this;
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

        public Criteria andDpRespMediatypeIsNull() {
            addCriterion("DP_RESP_MEDIATYPE is null");
            return (Criteria) this;
        }

        public Criteria andDpRespMediatypeIsNotNull() {
            addCriterion("DP_RESP_MEDIATYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespMediatypeEqualTo(String value) {
            addCriterion("DP_RESP_MEDIATYPE =", value, "dpRespMediatype");
            return (Criteria) this;
        }

        public Criteria andDpRespMediatypeNotEqualTo(String value) {
            addCriterion("DP_RESP_MEDIATYPE <>", value, "dpRespMediatype");
            return (Criteria) this;
        }

        public Criteria andDpRespMediatypeGreaterThan(String value) {
            addCriterion("DP_RESP_MEDIATYPE >", value, "dpRespMediatype");
            return (Criteria) this;
        }

        public Criteria andDpRespMediatypeGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_MEDIATYPE >=", value, "dpRespMediatype");
            return (Criteria) this;
        }

        public Criteria andDpRespMediatypeLessThan(String value) {
            addCriterion("DP_RESP_MEDIATYPE <", value, "dpRespMediatype");
            return (Criteria) this;
        }

        public Criteria andDpRespMediatypeLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_MEDIATYPE <=", value, "dpRespMediatype");
            return (Criteria) this;
        }

        public Criteria andDpRespMediatypeLike(String value) {
            addCriterion("DP_RESP_MEDIATYPE like", value, "dpRespMediatype");
            return (Criteria) this;
        }

        public Criteria andDpRespMediatypeNotLike(String value) {
            addCriterion("DP_RESP_MEDIATYPE not like", value, "dpRespMediatype");
            return (Criteria) this;
        }

        public Criteria andDpRespMediatypeIn(List<String> values) {
            addCriterion("DP_RESP_MEDIATYPE in", values, "dpRespMediatype");
            return (Criteria) this;
        }

        public Criteria andDpRespMediatypeNotIn(List<String> values) {
            addCriterion("DP_RESP_MEDIATYPE not in", values, "dpRespMediatype");
            return (Criteria) this;
        }

        public Criteria andDpRespMediatypeBetween(String value1, String value2) {
            addCriterion("DP_RESP_MEDIATYPE between", value1, value2, "dpRespMediatype");
            return (Criteria) this;
        }

        public Criteria andDpRespMediatypeNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_MEDIATYPE not between", value1, value2, "dpRespMediatype");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaaddressIsNull() {
            addCriterion("DP_RESP_MEDIAADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaaddressIsNotNull() {
            addCriterion("DP_RESP_MEDIAADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaaddressEqualTo(String value) {
            addCriterion("DP_RESP_MEDIAADDRESS =", value, "dpRespMediaaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaaddressNotEqualTo(String value) {
            addCriterion("DP_RESP_MEDIAADDRESS <>", value, "dpRespMediaaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaaddressGreaterThan(String value) {
            addCriterion("DP_RESP_MEDIAADDRESS >", value, "dpRespMediaaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaaddressGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_MEDIAADDRESS >=", value, "dpRespMediaaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaaddressLessThan(String value) {
            addCriterion("DP_RESP_MEDIAADDRESS <", value, "dpRespMediaaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaaddressLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_MEDIAADDRESS <=", value, "dpRespMediaaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaaddressLike(String value) {
            addCriterion("DP_RESP_MEDIAADDRESS like", value, "dpRespMediaaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaaddressNotLike(String value) {
            addCriterion("DP_RESP_MEDIAADDRESS not like", value, "dpRespMediaaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaaddressIn(List<String> values) {
            addCriterion("DP_RESP_MEDIAADDRESS in", values, "dpRespMediaaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaaddressNotIn(List<String> values) {
            addCriterion("DP_RESP_MEDIAADDRESS not in", values, "dpRespMediaaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaaddressBetween(String value1, String value2) {
            addCriterion("DP_RESP_MEDIAADDRESS between", value1, value2, "dpRespMediaaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespMediaaddressNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_MEDIAADDRESS not between", value1, value2, "dpRespMediaaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespThumbnailaddressIsNull() {
            addCriterion("DP_RESP_THUMBNAILADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andDpRespThumbnailaddressIsNotNull() {
            addCriterion("DP_RESP_THUMBNAILADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespThumbnailaddressEqualTo(String value) {
            addCriterion("DP_RESP_THUMBNAILADDRESS =", value, "dpRespThumbnailaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespThumbnailaddressNotEqualTo(String value) {
            addCriterion("DP_RESP_THUMBNAILADDRESS <>", value, "dpRespThumbnailaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespThumbnailaddressGreaterThan(String value) {
            addCriterion("DP_RESP_THUMBNAILADDRESS >", value, "dpRespThumbnailaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespThumbnailaddressGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_THUMBNAILADDRESS >=", value, "dpRespThumbnailaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespThumbnailaddressLessThan(String value) {
            addCriterion("DP_RESP_THUMBNAILADDRESS <", value, "dpRespThumbnailaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespThumbnailaddressLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_THUMBNAILADDRESS <=", value, "dpRespThumbnailaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespThumbnailaddressLike(String value) {
            addCriterion("DP_RESP_THUMBNAILADDRESS like", value, "dpRespThumbnailaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespThumbnailaddressNotLike(String value) {
            addCriterion("DP_RESP_THUMBNAILADDRESS not like", value, "dpRespThumbnailaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespThumbnailaddressIn(List<String> values) {
            addCriterion("DP_RESP_THUMBNAILADDRESS in", values, "dpRespThumbnailaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespThumbnailaddressNotIn(List<String> values) {
            addCriterion("DP_RESP_THUMBNAILADDRESS not in", values, "dpRespThumbnailaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespThumbnailaddressBetween(String value1, String value2) {
            addCriterion("DP_RESP_THUMBNAILADDRESS between", value1, value2, "dpRespThumbnailaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespThumbnailaddressNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_THUMBNAILADDRESS not between", value1, value2, "dpRespThumbnailaddress");
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