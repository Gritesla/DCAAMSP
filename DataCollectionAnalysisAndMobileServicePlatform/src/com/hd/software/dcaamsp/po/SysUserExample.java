package com.hd.software.dcaamsp.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
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

        public Criteria andDpRespUsercodeIsNull() {
            addCriterion("DP_RESP_USERCODE is null");
            return (Criteria) this;
        }

        public Criteria andDpRespUsercodeIsNotNull() {
            addCriterion("DP_RESP_USERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespUsercodeEqualTo(String value) {
            addCriterion("DP_RESP_USERCODE =", value, "dpRespUsercode");
            return (Criteria) this;
        }

        public Criteria andDpRespUsercodeNotEqualTo(String value) {
            addCriterion("DP_RESP_USERCODE <>", value, "dpRespUsercode");
            return (Criteria) this;
        }

        public Criteria andDpRespUsercodeGreaterThan(String value) {
            addCriterion("DP_RESP_USERCODE >", value, "dpRespUsercode");
            return (Criteria) this;
        }

        public Criteria andDpRespUsercodeGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_USERCODE >=", value, "dpRespUsercode");
            return (Criteria) this;
        }

        public Criteria andDpRespUsercodeLessThan(String value) {
            addCriterion("DP_RESP_USERCODE <", value, "dpRespUsercode");
            return (Criteria) this;
        }

        public Criteria andDpRespUsercodeLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_USERCODE <=", value, "dpRespUsercode");
            return (Criteria) this;
        }

        public Criteria andDpRespUsercodeLike(String value) {
            addCriterion("DP_RESP_USERCODE like", value, "dpRespUsercode");
            return (Criteria) this;
        }

        public Criteria andDpRespUsercodeNotLike(String value) {
            addCriterion("DP_RESP_USERCODE not like", value, "dpRespUsercode");
            return (Criteria) this;
        }

        public Criteria andDpRespUsercodeIn(List<String> values) {
            addCriterion("DP_RESP_USERCODE in", values, "dpRespUsercode");
            return (Criteria) this;
        }

        public Criteria andDpRespUsercodeNotIn(List<String> values) {
            addCriterion("DP_RESP_USERCODE not in", values, "dpRespUsercode");
            return (Criteria) this;
        }

        public Criteria andDpRespUsercodeBetween(String value1, String value2) {
            addCriterion("DP_RESP_USERCODE between", value1, value2, "dpRespUsercode");
            return (Criteria) this;
        }

        public Criteria andDpRespUsercodeNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_USERCODE not between", value1, value2, "dpRespUsercode");
            return (Criteria) this;
        }

        public Criteria andDpRespUsernameIsNull() {
            addCriterion("DP_RESP_USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andDpRespUsernameIsNotNull() {
            addCriterion("DP_RESP_USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespUsernameEqualTo(String value) {
            addCriterion("DP_RESP_USERNAME =", value, "dpRespUsername");
            return (Criteria) this;
        }

        public Criteria andDpRespUsernameNotEqualTo(String value) {
            addCriterion("DP_RESP_USERNAME <>", value, "dpRespUsername");
            return (Criteria) this;
        }

        public Criteria andDpRespUsernameGreaterThan(String value) {
            addCriterion("DP_RESP_USERNAME >", value, "dpRespUsername");
            return (Criteria) this;
        }

        public Criteria andDpRespUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_USERNAME >=", value, "dpRespUsername");
            return (Criteria) this;
        }

        public Criteria andDpRespUsernameLessThan(String value) {
            addCriterion("DP_RESP_USERNAME <", value, "dpRespUsername");
            return (Criteria) this;
        }

        public Criteria andDpRespUsernameLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_USERNAME <=", value, "dpRespUsername");
            return (Criteria) this;
        }

        public Criteria andDpRespUsernameLike(String value) {
            addCriterion("DP_RESP_USERNAME like", value, "dpRespUsername");
            return (Criteria) this;
        }

        public Criteria andDpRespUsernameNotLike(String value) {
            addCriterion("DP_RESP_USERNAME not like", value, "dpRespUsername");
            return (Criteria) this;
        }

        public Criteria andDpRespUsernameIn(List<String> values) {
            addCriterion("DP_RESP_USERNAME in", values, "dpRespUsername");
            return (Criteria) this;
        }

        public Criteria andDpRespUsernameNotIn(List<String> values) {
            addCriterion("DP_RESP_USERNAME not in", values, "dpRespUsername");
            return (Criteria) this;
        }

        public Criteria andDpRespUsernameBetween(String value1, String value2) {
            addCriterion("DP_RESP_USERNAME between", value1, value2, "dpRespUsername");
            return (Criteria) this;
        }

        public Criteria andDpRespUsernameNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_USERNAME not between", value1, value2, "dpRespUsername");
            return (Criteria) this;
        }

        public Criteria andDpRespPasswordIsNull() {
            addCriterion("DP_RESP_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andDpRespPasswordIsNotNull() {
            addCriterion("DP_RESP_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespPasswordEqualTo(String value) {
            addCriterion("DP_RESP_PASSWORD =", value, "dpRespPassword");
            return (Criteria) this;
        }

        public Criteria andDpRespPasswordNotEqualTo(String value) {
            addCriterion("DP_RESP_PASSWORD <>", value, "dpRespPassword");
            return (Criteria) this;
        }

        public Criteria andDpRespPasswordGreaterThan(String value) {
            addCriterion("DP_RESP_PASSWORD >", value, "dpRespPassword");
            return (Criteria) this;
        }

        public Criteria andDpRespPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_PASSWORD >=", value, "dpRespPassword");
            return (Criteria) this;
        }

        public Criteria andDpRespPasswordLessThan(String value) {
            addCriterion("DP_RESP_PASSWORD <", value, "dpRespPassword");
            return (Criteria) this;
        }

        public Criteria andDpRespPasswordLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_PASSWORD <=", value, "dpRespPassword");
            return (Criteria) this;
        }

        public Criteria andDpRespPasswordLike(String value) {
            addCriterion("DP_RESP_PASSWORD like", value, "dpRespPassword");
            return (Criteria) this;
        }

        public Criteria andDpRespPasswordNotLike(String value) {
            addCriterion("DP_RESP_PASSWORD not like", value, "dpRespPassword");
            return (Criteria) this;
        }

        public Criteria andDpRespPasswordIn(List<String> values) {
            addCriterion("DP_RESP_PASSWORD in", values, "dpRespPassword");
            return (Criteria) this;
        }

        public Criteria andDpRespPasswordNotIn(List<String> values) {
            addCriterion("DP_RESP_PASSWORD not in", values, "dpRespPassword");
            return (Criteria) this;
        }

        public Criteria andDpRespPasswordBetween(String value1, String value2) {
            addCriterion("DP_RESP_PASSWORD between", value1, value2, "dpRespPassword");
            return (Criteria) this;
        }

        public Criteria andDpRespPasswordNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_PASSWORD not between", value1, value2, "dpRespPassword");
            return (Criteria) this;
        }

        public Criteria andDpRespSaltIsNull() {
            addCriterion("DP_RESP_SALT is null");
            return (Criteria) this;
        }

        public Criteria andDpRespSaltIsNotNull() {
            addCriterion("DP_RESP_SALT is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespSaltEqualTo(String value) {
            addCriterion("DP_RESP_SALT =", value, "dpRespSalt");
            return (Criteria) this;
        }

        public Criteria andDpRespSaltNotEqualTo(String value) {
            addCriterion("DP_RESP_SALT <>", value, "dpRespSalt");
            return (Criteria) this;
        }

        public Criteria andDpRespSaltGreaterThan(String value) {
            addCriterion("DP_RESP_SALT >", value, "dpRespSalt");
            return (Criteria) this;
        }

        public Criteria andDpRespSaltGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_SALT >=", value, "dpRespSalt");
            return (Criteria) this;
        }

        public Criteria andDpRespSaltLessThan(String value) {
            addCriterion("DP_RESP_SALT <", value, "dpRespSalt");
            return (Criteria) this;
        }

        public Criteria andDpRespSaltLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_SALT <=", value, "dpRespSalt");
            return (Criteria) this;
        }

        public Criteria andDpRespSaltLike(String value) {
            addCriterion("DP_RESP_SALT like", value, "dpRespSalt");
            return (Criteria) this;
        }

        public Criteria andDpRespSaltNotLike(String value) {
            addCriterion("DP_RESP_SALT not like", value, "dpRespSalt");
            return (Criteria) this;
        }

        public Criteria andDpRespSaltIn(List<String> values) {
            addCriterion("DP_RESP_SALT in", values, "dpRespSalt");
            return (Criteria) this;
        }

        public Criteria andDpRespSaltNotIn(List<String> values) {
            addCriterion("DP_RESP_SALT not in", values, "dpRespSalt");
            return (Criteria) this;
        }

        public Criteria andDpRespSaltBetween(String value1, String value2) {
            addCriterion("DP_RESP_SALT between", value1, value2, "dpRespSalt");
            return (Criteria) this;
        }

        public Criteria andDpRespSaltNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_SALT not between", value1, value2, "dpRespSalt");
            return (Criteria) this;
        }

        public Criteria andDpRespLockIsNull() {
            addCriterion("DP_RESP_LOCK is null");
            return (Criteria) this;
        }

        public Criteria andDpRespLockIsNotNull() {
            addCriterion("DP_RESP_LOCK is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespLockEqualTo(String value) {
            addCriterion("DP_RESP_LOCK =", value, "dpRespLock");
            return (Criteria) this;
        }

        public Criteria andDpRespLockNotEqualTo(String value) {
            addCriterion("DP_RESP_LOCK <>", value, "dpRespLock");
            return (Criteria) this;
        }

        public Criteria andDpRespLockGreaterThan(String value) {
            addCriterion("DP_RESP_LOCK >", value, "dpRespLock");
            return (Criteria) this;
        }

        public Criteria andDpRespLockGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_LOCK >=", value, "dpRespLock");
            return (Criteria) this;
        }

        public Criteria andDpRespLockLessThan(String value) {
            addCriterion("DP_RESP_LOCK <", value, "dpRespLock");
            return (Criteria) this;
        }

        public Criteria andDpRespLockLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_LOCK <=", value, "dpRespLock");
            return (Criteria) this;
        }

        public Criteria andDpRespLockLike(String value) {
            addCriterion("DP_RESP_LOCK like", value, "dpRespLock");
            return (Criteria) this;
        }

        public Criteria andDpRespLockNotLike(String value) {
            addCriterion("DP_RESP_LOCK not like", value, "dpRespLock");
            return (Criteria) this;
        }

        public Criteria andDpRespLockIn(List<String> values) {
            addCriterion("DP_RESP_LOCK in", values, "dpRespLock");
            return (Criteria) this;
        }

        public Criteria andDpRespLockNotIn(List<String> values) {
            addCriterion("DP_RESP_LOCK not in", values, "dpRespLock");
            return (Criteria) this;
        }

        public Criteria andDpRespLockBetween(String value1, String value2) {
            addCriterion("DP_RESP_LOCK between", value1, value2, "dpRespLock");
            return (Criteria) this;
        }

        public Criteria andDpRespLockNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_LOCK not between", value1, value2, "dpRespLock");
            return (Criteria) this;
        }

        public Criteria andDpRespPlatformIsNull() {
            addCriterion("DP_RESP_PLATFORM is null");
            return (Criteria) this;
        }

        public Criteria andDpRespPlatformIsNotNull() {
            addCriterion("DP_RESP_PLATFORM is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespPlatformEqualTo(String value) {
            addCriterion("DP_RESP_PLATFORM =", value, "dpRespPlatform");
            return (Criteria) this;
        }

        public Criteria andDpRespPlatformNotEqualTo(String value) {
            addCriterion("DP_RESP_PLATFORM <>", value, "dpRespPlatform");
            return (Criteria) this;
        }

        public Criteria andDpRespPlatformGreaterThan(String value) {
            addCriterion("DP_RESP_PLATFORM >", value, "dpRespPlatform");
            return (Criteria) this;
        }

        public Criteria andDpRespPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_PLATFORM >=", value, "dpRespPlatform");
            return (Criteria) this;
        }

        public Criteria andDpRespPlatformLessThan(String value) {
            addCriterion("DP_RESP_PLATFORM <", value, "dpRespPlatform");
            return (Criteria) this;
        }

        public Criteria andDpRespPlatformLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_PLATFORM <=", value, "dpRespPlatform");
            return (Criteria) this;
        }

        public Criteria andDpRespPlatformLike(String value) {
            addCriterion("DP_RESP_PLATFORM like", value, "dpRespPlatform");
            return (Criteria) this;
        }

        public Criteria andDpRespPlatformNotLike(String value) {
            addCriterion("DP_RESP_PLATFORM not like", value, "dpRespPlatform");
            return (Criteria) this;
        }

        public Criteria andDpRespPlatformIn(List<String> values) {
            addCriterion("DP_RESP_PLATFORM in", values, "dpRespPlatform");
            return (Criteria) this;
        }

        public Criteria andDpRespPlatformNotIn(List<String> values) {
            addCriterion("DP_RESP_PLATFORM not in", values, "dpRespPlatform");
            return (Criteria) this;
        }

        public Criteria andDpRespPlatformBetween(String value1, String value2) {
            addCriterion("DP_RESP_PLATFORM between", value1, value2, "dpRespPlatform");
            return (Criteria) this;
        }

        public Criteria andDpRespPlatformNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_PLATFORM not between", value1, value2, "dpRespPlatform");
            return (Criteria) this;
        }

        public Criteria andDpRespDelIsNull() {
            addCriterion("DP_RESP_DEL is null");
            return (Criteria) this;
        }

        public Criteria andDpRespDelIsNotNull() {
            addCriterion("DP_RESP_DEL is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespDelEqualTo(String value) {
            addCriterion("DP_RESP_DEL =", value, "dpRespDel");
            return (Criteria) this;
        }

        public Criteria andDpRespDelNotEqualTo(String value) {
            addCriterion("DP_RESP_DEL <>", value, "dpRespDel");
            return (Criteria) this;
        }

        public Criteria andDpRespDelGreaterThan(String value) {
            addCriterion("DP_RESP_DEL >", value, "dpRespDel");
            return (Criteria) this;
        }

        public Criteria andDpRespDelGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DEL >=", value, "dpRespDel");
            return (Criteria) this;
        }

        public Criteria andDpRespDelLessThan(String value) {
            addCriterion("DP_RESP_DEL <", value, "dpRespDel");
            return (Criteria) this;
        }

        public Criteria andDpRespDelLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DEL <=", value, "dpRespDel");
            return (Criteria) this;
        }

        public Criteria andDpRespDelLike(String value) {
            addCriterion("DP_RESP_DEL like", value, "dpRespDel");
            return (Criteria) this;
        }

        public Criteria andDpRespDelNotLike(String value) {
            addCriterion("DP_RESP_DEL not like", value, "dpRespDel");
            return (Criteria) this;
        }

        public Criteria andDpRespDelIn(List<String> values) {
            addCriterion("DP_RESP_DEL in", values, "dpRespDel");
            return (Criteria) this;
        }

        public Criteria andDpRespDelNotIn(List<String> values) {
            addCriterion("DP_RESP_DEL not in", values, "dpRespDel");
            return (Criteria) this;
        }

        public Criteria andDpRespDelBetween(String value1, String value2) {
            addCriterion("DP_RESP_DEL between", value1, value2, "dpRespDel");
            return (Criteria) this;
        }

        public Criteria andDpRespDelNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_DEL not between", value1, value2, "dpRespDel");
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