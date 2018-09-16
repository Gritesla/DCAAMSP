package com.hd.software.dcaamsp.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysPermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysPermissionExample() {
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

        public Criteria andDpRespCodeIsNull() {
            addCriterion("DP_RESP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDpRespCodeIsNotNull() {
            addCriterion("DP_RESP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespCodeEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_CODE =", value, "dpRespCode");
            return (Criteria) this;
        }

        public Criteria andDpRespCodeNotEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_CODE <>", value, "dpRespCode");
            return (Criteria) this;
        }

        public Criteria andDpRespCodeGreaterThan(BigDecimal value) {
            addCriterion("DP_RESP_CODE >", value, "dpRespCode");
            return (Criteria) this;
        }

        public Criteria andDpRespCodeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_CODE >=", value, "dpRespCode");
            return (Criteria) this;
        }

        public Criteria andDpRespCodeLessThan(BigDecimal value) {
            addCriterion("DP_RESP_CODE <", value, "dpRespCode");
            return (Criteria) this;
        }

        public Criteria andDpRespCodeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_CODE <=", value, "dpRespCode");
            return (Criteria) this;
        }

        public Criteria andDpRespCodeIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_CODE in", values, "dpRespCode");
            return (Criteria) this;
        }

        public Criteria andDpRespCodeNotIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_CODE not in", values, "dpRespCode");
            return (Criteria) this;
        }

        public Criteria andDpRespCodeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_CODE between", value1, value2, "dpRespCode");
            return (Criteria) this;
        }

        public Criteria andDpRespCodeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_CODE not between", value1, value2, "dpRespCode");
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

        public Criteria andDpRespTypeIsNull() {
            addCriterion("DP_RESP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDpRespTypeIsNotNull() {
            addCriterion("DP_RESP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespTypeEqualTo(String value) {
            addCriterion("DP_RESP_TYPE =", value, "dpRespType");
            return (Criteria) this;
        }

        public Criteria andDpRespTypeNotEqualTo(String value) {
            addCriterion("DP_RESP_TYPE <>", value, "dpRespType");
            return (Criteria) this;
        }

        public Criteria andDpRespTypeGreaterThan(String value) {
            addCriterion("DP_RESP_TYPE >", value, "dpRespType");
            return (Criteria) this;
        }

        public Criteria andDpRespTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_TYPE >=", value, "dpRespType");
            return (Criteria) this;
        }

        public Criteria andDpRespTypeLessThan(String value) {
            addCriterion("DP_RESP_TYPE <", value, "dpRespType");
            return (Criteria) this;
        }

        public Criteria andDpRespTypeLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_TYPE <=", value, "dpRespType");
            return (Criteria) this;
        }

        public Criteria andDpRespTypeLike(String value) {
            addCriterion("DP_RESP_TYPE like", value, "dpRespType");
            return (Criteria) this;
        }

        public Criteria andDpRespTypeNotLike(String value) {
            addCriterion("DP_RESP_TYPE not like", value, "dpRespType");
            return (Criteria) this;
        }

        public Criteria andDpRespTypeIn(List<String> values) {
            addCriterion("DP_RESP_TYPE in", values, "dpRespType");
            return (Criteria) this;
        }

        public Criteria andDpRespTypeNotIn(List<String> values) {
            addCriterion("DP_RESP_TYPE not in", values, "dpRespType");
            return (Criteria) this;
        }

        public Criteria andDpRespTypeBetween(String value1, String value2) {
            addCriterion("DP_RESP_TYPE between", value1, value2, "dpRespType");
            return (Criteria) this;
        }

        public Criteria andDpRespTypeNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_TYPE not between", value1, value2, "dpRespType");
            return (Criteria) this;
        }

        public Criteria andDpRespPcodeIsNull() {
            addCriterion("DP_RESP_PCODE is null");
            return (Criteria) this;
        }

        public Criteria andDpRespPcodeIsNotNull() {
            addCriterion("DP_RESP_PCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespPcodeEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_PCODE =", value, "dpRespPcode");
            return (Criteria) this;
        }

        public Criteria andDpRespPcodeNotEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_PCODE <>", value, "dpRespPcode");
            return (Criteria) this;
        }

        public Criteria andDpRespPcodeGreaterThan(BigDecimal value) {
            addCriterion("DP_RESP_PCODE >", value, "dpRespPcode");
            return (Criteria) this;
        }

        public Criteria andDpRespPcodeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_PCODE >=", value, "dpRespPcode");
            return (Criteria) this;
        }

        public Criteria andDpRespPcodeLessThan(BigDecimal value) {
            addCriterion("DP_RESP_PCODE <", value, "dpRespPcode");
            return (Criteria) this;
        }

        public Criteria andDpRespPcodeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_PCODE <=", value, "dpRespPcode");
            return (Criteria) this;
        }

        public Criteria andDpRespPcodeIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_PCODE in", values, "dpRespPcode");
            return (Criteria) this;
        }

        public Criteria andDpRespPcodeNotIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_PCODE not in", values, "dpRespPcode");
            return (Criteria) this;
        }

        public Criteria andDpRespPcodeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_PCODE between", value1, value2, "dpRespPcode");
            return (Criteria) this;
        }

        public Criteria andDpRespPcodeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_PCODE not between", value1, value2, "dpRespPcode");
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

        public Criteria andDpRespSortIsNull() {
            addCriterion("DP_RESP_SORT is null");
            return (Criteria) this;
        }

        public Criteria andDpRespSortIsNotNull() {
            addCriterion("DP_RESP_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespSortEqualTo(String value) {
            addCriterion("DP_RESP_SORT =", value, "dpRespSort");
            return (Criteria) this;
        }

        public Criteria andDpRespSortNotEqualTo(String value) {
            addCriterion("DP_RESP_SORT <>", value, "dpRespSort");
            return (Criteria) this;
        }

        public Criteria andDpRespSortGreaterThan(String value) {
            addCriterion("DP_RESP_SORT >", value, "dpRespSort");
            return (Criteria) this;
        }

        public Criteria andDpRespSortGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_SORT >=", value, "dpRespSort");
            return (Criteria) this;
        }

        public Criteria andDpRespSortLessThan(String value) {
            addCriterion("DP_RESP_SORT <", value, "dpRespSort");
            return (Criteria) this;
        }

        public Criteria andDpRespSortLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_SORT <=", value, "dpRespSort");
            return (Criteria) this;
        }

        public Criteria andDpRespSortLike(String value) {
            addCriterion("DP_RESP_SORT like", value, "dpRespSort");
            return (Criteria) this;
        }

        public Criteria andDpRespSortNotLike(String value) {
            addCriterion("DP_RESP_SORT not like", value, "dpRespSort");
            return (Criteria) this;
        }

        public Criteria andDpRespSortIn(List<String> values) {
            addCriterion("DP_RESP_SORT in", values, "dpRespSort");
            return (Criteria) this;
        }

        public Criteria andDpRespSortNotIn(List<String> values) {
            addCriterion("DP_RESP_SORT not in", values, "dpRespSort");
            return (Criteria) this;
        }

        public Criteria andDpRespSortBetween(String value1, String value2) {
            addCriterion("DP_RESP_SORT between", value1, value2, "dpRespSort");
            return (Criteria) this;
        }

        public Criteria andDpRespSortNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_SORT not between", value1, value2, "dpRespSort");
            return (Criteria) this;
        }

        public Criteria andDpRespPidsIsNull() {
            addCriterion("DP_RESP_PIDS is null");
            return (Criteria) this;
        }

        public Criteria andDpRespPidsIsNotNull() {
            addCriterion("DP_RESP_PIDS is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespPidsEqualTo(String value) {
            addCriterion("DP_RESP_PIDS =", value, "dpRespPids");
            return (Criteria) this;
        }

        public Criteria andDpRespPidsNotEqualTo(String value) {
            addCriterion("DP_RESP_PIDS <>", value, "dpRespPids");
            return (Criteria) this;
        }

        public Criteria andDpRespPidsGreaterThan(String value) {
            addCriterion("DP_RESP_PIDS >", value, "dpRespPids");
            return (Criteria) this;
        }

        public Criteria andDpRespPidsGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_PIDS >=", value, "dpRespPids");
            return (Criteria) this;
        }

        public Criteria andDpRespPidsLessThan(String value) {
            addCriterion("DP_RESP_PIDS <", value, "dpRespPids");
            return (Criteria) this;
        }

        public Criteria andDpRespPidsLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_PIDS <=", value, "dpRespPids");
            return (Criteria) this;
        }

        public Criteria andDpRespPidsLike(String value) {
            addCriterion("DP_RESP_PIDS like", value, "dpRespPids");
            return (Criteria) this;
        }

        public Criteria andDpRespPidsNotLike(String value) {
            addCriterion("DP_RESP_PIDS not like", value, "dpRespPids");
            return (Criteria) this;
        }

        public Criteria andDpRespPidsIn(List<String> values) {
            addCriterion("DP_RESP_PIDS in", values, "dpRespPids");
            return (Criteria) this;
        }

        public Criteria andDpRespPidsNotIn(List<String> values) {
            addCriterion("DP_RESP_PIDS not in", values, "dpRespPids");
            return (Criteria) this;
        }

        public Criteria andDpRespPidsBetween(String value1, String value2) {
            addCriterion("DP_RESP_PIDS between", value1, value2, "dpRespPids");
            return (Criteria) this;
        }

        public Criteria andDpRespPidsNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_PIDS not between", value1, value2, "dpRespPids");
            return (Criteria) this;
        }

        public Criteria andDpRespUrlIsNull() {
            addCriterion("DP_RESP_URL is null");
            return (Criteria) this;
        }

        public Criteria andDpRespUrlIsNotNull() {
            addCriterion("DP_RESP_URL is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespUrlEqualTo(String value) {
            addCriterion("DP_RESP_URL =", value, "dpRespUrl");
            return (Criteria) this;
        }

        public Criteria andDpRespUrlNotEqualTo(String value) {
            addCriterion("DP_RESP_URL <>", value, "dpRespUrl");
            return (Criteria) this;
        }

        public Criteria andDpRespUrlGreaterThan(String value) {
            addCriterion("DP_RESP_URL >", value, "dpRespUrl");
            return (Criteria) this;
        }

        public Criteria andDpRespUrlGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_URL >=", value, "dpRespUrl");
            return (Criteria) this;
        }

        public Criteria andDpRespUrlLessThan(String value) {
            addCriterion("DP_RESP_URL <", value, "dpRespUrl");
            return (Criteria) this;
        }

        public Criteria andDpRespUrlLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_URL <=", value, "dpRespUrl");
            return (Criteria) this;
        }

        public Criteria andDpRespUrlLike(String value) {
            addCriterion("DP_RESP_URL like", value, "dpRespUrl");
            return (Criteria) this;
        }

        public Criteria andDpRespUrlNotLike(String value) {
            addCriterion("DP_RESP_URL not like", value, "dpRespUrl");
            return (Criteria) this;
        }

        public Criteria andDpRespUrlIn(List<String> values) {
            addCriterion("DP_RESP_URL in", values, "dpRespUrl");
            return (Criteria) this;
        }

        public Criteria andDpRespUrlNotIn(List<String> values) {
            addCriterion("DP_RESP_URL not in", values, "dpRespUrl");
            return (Criteria) this;
        }

        public Criteria andDpRespUrlBetween(String value1, String value2) {
            addCriterion("DP_RESP_URL between", value1, value2, "dpRespUrl");
            return (Criteria) this;
        }

        public Criteria andDpRespUrlNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_URL not between", value1, value2, "dpRespUrl");
            return (Criteria) this;
        }

        public Criteria andDpRespDespIsNull() {
            addCriterion("DP_RESP_DESP is null");
            return (Criteria) this;
        }

        public Criteria andDpRespDespIsNotNull() {
            addCriterion("DP_RESP_DESP is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespDespEqualTo(String value) {
            addCriterion("DP_RESP_DESP =", value, "dpRespDesp");
            return (Criteria) this;
        }

        public Criteria andDpRespDespNotEqualTo(String value) {
            addCriterion("DP_RESP_DESP <>", value, "dpRespDesp");
            return (Criteria) this;
        }

        public Criteria andDpRespDespGreaterThan(String value) {
            addCriterion("DP_RESP_DESP >", value, "dpRespDesp");
            return (Criteria) this;
        }

        public Criteria andDpRespDespGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DESP >=", value, "dpRespDesp");
            return (Criteria) this;
        }

        public Criteria andDpRespDespLessThan(String value) {
            addCriterion("DP_RESP_DESP <", value, "dpRespDesp");
            return (Criteria) this;
        }

        public Criteria andDpRespDespLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DESP <=", value, "dpRespDesp");
            return (Criteria) this;
        }

        public Criteria andDpRespDespLike(String value) {
            addCriterion("DP_RESP_DESP like", value, "dpRespDesp");
            return (Criteria) this;
        }

        public Criteria andDpRespDespNotLike(String value) {
            addCriterion("DP_RESP_DESP not like", value, "dpRespDesp");
            return (Criteria) this;
        }

        public Criteria andDpRespDespIn(List<String> values) {
            addCriterion("DP_RESP_DESP in", values, "dpRespDesp");
            return (Criteria) this;
        }

        public Criteria andDpRespDespNotIn(List<String> values) {
            addCriterion("DP_RESP_DESP not in", values, "dpRespDesp");
            return (Criteria) this;
        }

        public Criteria andDpRespDespBetween(String value1, String value2) {
            addCriterion("DP_RESP_DESP between", value1, value2, "dpRespDesp");
            return (Criteria) this;
        }

        public Criteria andDpRespDespNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_DESP not between", value1, value2, "dpRespDesp");
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