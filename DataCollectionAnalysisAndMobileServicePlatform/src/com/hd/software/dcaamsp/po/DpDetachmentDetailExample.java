package com.hd.software.dcaamsp.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DpDetachmentDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DpDetachmentDetailExample() {
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

        public Criteria andDpRespArmedPoliceSystemIsNull() {
            addCriterion("DP_RESP_ARMED_POLICE_SYSTEM is null");
            return (Criteria) this;
        }

        public Criteria andDpRespArmedPoliceSystemIsNotNull() {
            addCriterion("DP_RESP_ARMED_POLICE_SYSTEM is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespArmedPoliceSystemEqualTo(String value) {
            addCriterion("DP_RESP_ARMED_POLICE_SYSTEM =", value, "dpRespArmedPoliceSystem");
            return (Criteria) this;
        }

        public Criteria andDpRespArmedPoliceSystemNotEqualTo(String value) {
            addCriterion("DP_RESP_ARMED_POLICE_SYSTEM <>", value, "dpRespArmedPoliceSystem");
            return (Criteria) this;
        }

        public Criteria andDpRespArmedPoliceSystemGreaterThan(String value) {
            addCriterion("DP_RESP_ARMED_POLICE_SYSTEM >", value, "dpRespArmedPoliceSystem");
            return (Criteria) this;
        }

        public Criteria andDpRespArmedPoliceSystemGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_ARMED_POLICE_SYSTEM >=", value, "dpRespArmedPoliceSystem");
            return (Criteria) this;
        }

        public Criteria andDpRespArmedPoliceSystemLessThan(String value) {
            addCriterion("DP_RESP_ARMED_POLICE_SYSTEM <", value, "dpRespArmedPoliceSystem");
            return (Criteria) this;
        }

        public Criteria andDpRespArmedPoliceSystemLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_ARMED_POLICE_SYSTEM <=", value, "dpRespArmedPoliceSystem");
            return (Criteria) this;
        }

        public Criteria andDpRespArmedPoliceSystemLike(String value) {
            addCriterion("DP_RESP_ARMED_POLICE_SYSTEM like", value, "dpRespArmedPoliceSystem");
            return (Criteria) this;
        }

        public Criteria andDpRespArmedPoliceSystemNotLike(String value) {
            addCriterion("DP_RESP_ARMED_POLICE_SYSTEM not like", value, "dpRespArmedPoliceSystem");
            return (Criteria) this;
        }

        public Criteria andDpRespArmedPoliceSystemIn(List<String> values) {
            addCriterion("DP_RESP_ARMED_POLICE_SYSTEM in", values, "dpRespArmedPoliceSystem");
            return (Criteria) this;
        }

        public Criteria andDpRespArmedPoliceSystemNotIn(List<String> values) {
            addCriterion("DP_RESP_ARMED_POLICE_SYSTEM not in", values, "dpRespArmedPoliceSystem");
            return (Criteria) this;
        }

        public Criteria andDpRespArmedPoliceSystemBetween(String value1, String value2) {
            addCriterion("DP_RESP_ARMED_POLICE_SYSTEM between", value1, value2, "dpRespArmedPoliceSystem");
            return (Criteria) this;
        }

        public Criteria andDpRespArmedPoliceSystemNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_ARMED_POLICE_SYSTEM not between", value1, value2, "dpRespArmedPoliceSystem");
            return (Criteria) this;
        }

        public Criteria andDpRespPersonnelTotalIsNull() {
            addCriterion("DP_RESP_PERSONNEL_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andDpRespPersonnelTotalIsNotNull() {
            addCriterion("DP_RESP_PERSONNEL_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespPersonnelTotalEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_PERSONNEL_TOTAL =", value, "dpRespPersonnelTotal");
            return (Criteria) this;
        }

        public Criteria andDpRespPersonnelTotalNotEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_PERSONNEL_TOTAL <>", value, "dpRespPersonnelTotal");
            return (Criteria) this;
        }

        public Criteria andDpRespPersonnelTotalGreaterThan(BigDecimal value) {
            addCriterion("DP_RESP_PERSONNEL_TOTAL >", value, "dpRespPersonnelTotal");
            return (Criteria) this;
        }

        public Criteria andDpRespPersonnelTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_PERSONNEL_TOTAL >=", value, "dpRespPersonnelTotal");
            return (Criteria) this;
        }

        public Criteria andDpRespPersonnelTotalLessThan(BigDecimal value) {
            addCriterion("DP_RESP_PERSONNEL_TOTAL <", value, "dpRespPersonnelTotal");
            return (Criteria) this;
        }

        public Criteria andDpRespPersonnelTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_PERSONNEL_TOTAL <=", value, "dpRespPersonnelTotal");
            return (Criteria) this;
        }

        public Criteria andDpRespPersonnelTotalIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_PERSONNEL_TOTAL in", values, "dpRespPersonnelTotal");
            return (Criteria) this;
        }

        public Criteria andDpRespPersonnelTotalNotIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_PERSONNEL_TOTAL not in", values, "dpRespPersonnelTotal");
            return (Criteria) this;
        }

        public Criteria andDpRespPersonnelTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_PERSONNEL_TOTAL between", value1, value2, "dpRespPersonnelTotal");
            return (Criteria) this;
        }

        public Criteria andDpRespPersonnelTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_PERSONNEL_TOTAL not between", value1, value2, "dpRespPersonnelTotal");
            return (Criteria) this;
        }

        public Criteria andDpRespCadreIsNull() {
            addCriterion("DP_RESP_CADRE is null");
            return (Criteria) this;
        }

        public Criteria andDpRespCadreIsNotNull() {
            addCriterion("DP_RESP_CADRE is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespCadreEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_CADRE =", value, "dpRespCadre");
            return (Criteria) this;
        }

        public Criteria andDpRespCadreNotEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_CADRE <>", value, "dpRespCadre");
            return (Criteria) this;
        }

        public Criteria andDpRespCadreGreaterThan(BigDecimal value) {
            addCriterion("DP_RESP_CADRE >", value, "dpRespCadre");
            return (Criteria) this;
        }

        public Criteria andDpRespCadreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_CADRE >=", value, "dpRespCadre");
            return (Criteria) this;
        }

        public Criteria andDpRespCadreLessThan(BigDecimal value) {
            addCriterion("DP_RESP_CADRE <", value, "dpRespCadre");
            return (Criteria) this;
        }

        public Criteria andDpRespCadreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_CADRE <=", value, "dpRespCadre");
            return (Criteria) this;
        }

        public Criteria andDpRespCadreIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_CADRE in", values, "dpRespCadre");
            return (Criteria) this;
        }

        public Criteria andDpRespCadreNotIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_CADRE not in", values, "dpRespCadre");
            return (Criteria) this;
        }

        public Criteria andDpRespCadreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_CADRE between", value1, value2, "dpRespCadre");
            return (Criteria) this;
        }

        public Criteria andDpRespCadreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_CADRE not between", value1, value2, "dpRespCadre");
            return (Criteria) this;
        }

        public Criteria andDpRespSoldiersIsNull() {
            addCriterion("DP_RESP_SOLDIERS is null");
            return (Criteria) this;
        }

        public Criteria andDpRespSoldiersIsNotNull() {
            addCriterion("DP_RESP_SOLDIERS is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespSoldiersEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_SOLDIERS =", value, "dpRespSoldiers");
            return (Criteria) this;
        }

        public Criteria andDpRespSoldiersNotEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_SOLDIERS <>", value, "dpRespSoldiers");
            return (Criteria) this;
        }

        public Criteria andDpRespSoldiersGreaterThan(BigDecimal value) {
            addCriterion("DP_RESP_SOLDIERS >", value, "dpRespSoldiers");
            return (Criteria) this;
        }

        public Criteria andDpRespSoldiersGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_SOLDIERS >=", value, "dpRespSoldiers");
            return (Criteria) this;
        }

        public Criteria andDpRespSoldiersLessThan(BigDecimal value) {
            addCriterion("DP_RESP_SOLDIERS <", value, "dpRespSoldiers");
            return (Criteria) this;
        }

        public Criteria andDpRespSoldiersLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_SOLDIERS <=", value, "dpRespSoldiers");
            return (Criteria) this;
        }

        public Criteria andDpRespSoldiersIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_SOLDIERS in", values, "dpRespSoldiers");
            return (Criteria) this;
        }

        public Criteria andDpRespSoldiersNotIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_SOLDIERS not in", values, "dpRespSoldiers");
            return (Criteria) this;
        }

        public Criteria andDpRespSoldiersBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_SOLDIERS between", value1, value2, "dpRespSoldiers");
            return (Criteria) this;
        }

        public Criteria andDpRespSoldiersNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_SOLDIERS not between", value1, value2, "dpRespSoldiers");
            return (Criteria) this;
        }

        public Criteria andDpRespFiremanIsNull() {
            addCriterion("DP_RESP_FIREMAN is null");
            return (Criteria) this;
        }

        public Criteria andDpRespFiremanIsNotNull() {
            addCriterion("DP_RESP_FIREMAN is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespFiremanEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_FIREMAN =", value, "dpRespFireman");
            return (Criteria) this;
        }

        public Criteria andDpRespFiremanNotEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_FIREMAN <>", value, "dpRespFireman");
            return (Criteria) this;
        }

        public Criteria andDpRespFiremanGreaterThan(BigDecimal value) {
            addCriterion("DP_RESP_FIREMAN >", value, "dpRespFireman");
            return (Criteria) this;
        }

        public Criteria andDpRespFiremanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_FIREMAN >=", value, "dpRespFireman");
            return (Criteria) this;
        }

        public Criteria andDpRespFiremanLessThan(BigDecimal value) {
            addCriterion("DP_RESP_FIREMAN <", value, "dpRespFireman");
            return (Criteria) this;
        }

        public Criteria andDpRespFiremanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_FIREMAN <=", value, "dpRespFireman");
            return (Criteria) this;
        }

        public Criteria andDpRespFiremanIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_FIREMAN in", values, "dpRespFireman");
            return (Criteria) this;
        }

        public Criteria andDpRespFiremanNotIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_FIREMAN not in", values, "dpRespFireman");
            return (Criteria) this;
        }

        public Criteria andDpRespFiremanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_FIREMAN between", value1, value2, "dpRespFireman");
            return (Criteria) this;
        }

        public Criteria andDpRespFiremanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_FIREMAN not between", value1, value2, "dpRespFireman");
            return (Criteria) this;
        }

        public Criteria andDpRespNumberCarsIsNull() {
            addCriterion("DP_RESP_NUMBER_CARS is null");
            return (Criteria) this;
        }

        public Criteria andDpRespNumberCarsIsNotNull() {
            addCriterion("DP_RESP_NUMBER_CARS is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespNumberCarsEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_NUMBER_CARS =", value, "dpRespNumberCars");
            return (Criteria) this;
        }

        public Criteria andDpRespNumberCarsNotEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_NUMBER_CARS <>", value, "dpRespNumberCars");
            return (Criteria) this;
        }

        public Criteria andDpRespNumberCarsGreaterThan(BigDecimal value) {
            addCriterion("DP_RESP_NUMBER_CARS >", value, "dpRespNumberCars");
            return (Criteria) this;
        }

        public Criteria andDpRespNumberCarsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_NUMBER_CARS >=", value, "dpRespNumberCars");
            return (Criteria) this;
        }

        public Criteria andDpRespNumberCarsLessThan(BigDecimal value) {
            addCriterion("DP_RESP_NUMBER_CARS <", value, "dpRespNumberCars");
            return (Criteria) this;
        }

        public Criteria andDpRespNumberCarsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_NUMBER_CARS <=", value, "dpRespNumberCars");
            return (Criteria) this;
        }

        public Criteria andDpRespNumberCarsIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_NUMBER_CARS in", values, "dpRespNumberCars");
            return (Criteria) this;
        }

        public Criteria andDpRespNumberCarsNotIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_NUMBER_CARS not in", values, "dpRespNumberCars");
            return (Criteria) this;
        }

        public Criteria andDpRespNumberCarsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_NUMBER_CARS between", value1, value2, "dpRespNumberCars");
            return (Criteria) this;
        }

        public Criteria andDpRespNumberCarsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_NUMBER_CARS not between", value1, value2, "dpRespNumberCars");
            return (Criteria) this;
        }

        public Criteria andDpRespOutTrainIsNull() {
            addCriterion("DP_RESP_OUT_TRAIN is null");
            return (Criteria) this;
        }

        public Criteria andDpRespOutTrainIsNotNull() {
            addCriterion("DP_RESP_OUT_TRAIN is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespOutTrainEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_OUT_TRAIN =", value, "dpRespOutTrain");
            return (Criteria) this;
        }

        public Criteria andDpRespOutTrainNotEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_OUT_TRAIN <>", value, "dpRespOutTrain");
            return (Criteria) this;
        }

        public Criteria andDpRespOutTrainGreaterThan(BigDecimal value) {
            addCriterion("DP_RESP_OUT_TRAIN >", value, "dpRespOutTrain");
            return (Criteria) this;
        }

        public Criteria andDpRespOutTrainGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_OUT_TRAIN >=", value, "dpRespOutTrain");
            return (Criteria) this;
        }

        public Criteria andDpRespOutTrainLessThan(BigDecimal value) {
            addCriterion("DP_RESP_OUT_TRAIN <", value, "dpRespOutTrain");
            return (Criteria) this;
        }

        public Criteria andDpRespOutTrainLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_OUT_TRAIN <=", value, "dpRespOutTrain");
            return (Criteria) this;
        }

        public Criteria andDpRespOutTrainIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_OUT_TRAIN in", values, "dpRespOutTrain");
            return (Criteria) this;
        }

        public Criteria andDpRespOutTrainNotIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_OUT_TRAIN not in", values, "dpRespOutTrain");
            return (Criteria) this;
        }

        public Criteria andDpRespOutTrainBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_OUT_TRAIN between", value1, value2, "dpRespOutTrain");
            return (Criteria) this;
        }

        public Criteria andDpRespOutTrainNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_OUT_TRAIN not between", value1, value2, "dpRespOutTrain");
            return (Criteria) this;
        }

        public Criteria andDpRespLiftCarIsNull() {
            addCriterion("DP_RESP_LIFT_CAR is null");
            return (Criteria) this;
        }

        public Criteria andDpRespLiftCarIsNotNull() {
            addCriterion("DP_RESP_LIFT_CAR is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespLiftCarEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_LIFT_CAR =", value, "dpRespLiftCar");
            return (Criteria) this;
        }

        public Criteria andDpRespLiftCarNotEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_LIFT_CAR <>", value, "dpRespLiftCar");
            return (Criteria) this;
        }

        public Criteria andDpRespLiftCarGreaterThan(BigDecimal value) {
            addCriterion("DP_RESP_LIFT_CAR >", value, "dpRespLiftCar");
            return (Criteria) this;
        }

        public Criteria andDpRespLiftCarGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_LIFT_CAR >=", value, "dpRespLiftCar");
            return (Criteria) this;
        }

        public Criteria andDpRespLiftCarLessThan(BigDecimal value) {
            addCriterion("DP_RESP_LIFT_CAR <", value, "dpRespLiftCar");
            return (Criteria) this;
        }

        public Criteria andDpRespLiftCarLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_LIFT_CAR <=", value, "dpRespLiftCar");
            return (Criteria) this;
        }

        public Criteria andDpRespLiftCarIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_LIFT_CAR in", values, "dpRespLiftCar");
            return (Criteria) this;
        }

        public Criteria andDpRespLiftCarNotIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_LIFT_CAR not in", values, "dpRespLiftCar");
            return (Criteria) this;
        }

        public Criteria andDpRespLiftCarBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_LIFT_CAR between", value1, value2, "dpRespLiftCar");
            return (Criteria) this;
        }

        public Criteria andDpRespLiftCarNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_LIFT_CAR not between", value1, value2, "dpRespLiftCar");
            return (Criteria) this;
        }

        public Criteria andDpRespDedicatedCarIsNull() {
            addCriterion("DP_RESP_DEDICATED_CAR is null");
            return (Criteria) this;
        }

        public Criteria andDpRespDedicatedCarIsNotNull() {
            addCriterion("DP_RESP_DEDICATED_CAR is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespDedicatedCarEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_DEDICATED_CAR =", value, "dpRespDedicatedCar");
            return (Criteria) this;
        }

        public Criteria andDpRespDedicatedCarNotEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_DEDICATED_CAR <>", value, "dpRespDedicatedCar");
            return (Criteria) this;
        }

        public Criteria andDpRespDedicatedCarGreaterThan(BigDecimal value) {
            addCriterion("DP_RESP_DEDICATED_CAR >", value, "dpRespDedicatedCar");
            return (Criteria) this;
        }

        public Criteria andDpRespDedicatedCarGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_DEDICATED_CAR >=", value, "dpRespDedicatedCar");
            return (Criteria) this;
        }

        public Criteria andDpRespDedicatedCarLessThan(BigDecimal value) {
            addCriterion("DP_RESP_DEDICATED_CAR <", value, "dpRespDedicatedCar");
            return (Criteria) this;
        }

        public Criteria andDpRespDedicatedCarLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_DEDICATED_CAR <=", value, "dpRespDedicatedCar");
            return (Criteria) this;
        }

        public Criteria andDpRespDedicatedCarIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_DEDICATED_CAR in", values, "dpRespDedicatedCar");
            return (Criteria) this;
        }

        public Criteria andDpRespDedicatedCarNotIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_DEDICATED_CAR not in", values, "dpRespDedicatedCar");
            return (Criteria) this;
        }

        public Criteria andDpRespDedicatedCarBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_DEDICATED_CAR between", value1, value2, "dpRespDedicatedCar");
            return (Criteria) this;
        }

        public Criteria andDpRespDedicatedCarNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_DEDICATED_CAR not between", value1, value2, "dpRespDedicatedCar");
            return (Criteria) this;
        }

        public Criteria andDpRespBattleCarIsNull() {
            addCriterion("DP_RESP_BATTLE_CAR is null");
            return (Criteria) this;
        }

        public Criteria andDpRespBattleCarIsNotNull() {
            addCriterion("DP_RESP_BATTLE_CAR is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespBattleCarEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_BATTLE_CAR =", value, "dpRespBattleCar");
            return (Criteria) this;
        }

        public Criteria andDpRespBattleCarNotEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_BATTLE_CAR <>", value, "dpRespBattleCar");
            return (Criteria) this;
        }

        public Criteria andDpRespBattleCarGreaterThan(BigDecimal value) {
            addCriterion("DP_RESP_BATTLE_CAR >", value, "dpRespBattleCar");
            return (Criteria) this;
        }

        public Criteria andDpRespBattleCarGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_BATTLE_CAR >=", value, "dpRespBattleCar");
            return (Criteria) this;
        }

        public Criteria andDpRespBattleCarLessThan(BigDecimal value) {
            addCriterion("DP_RESP_BATTLE_CAR <", value, "dpRespBattleCar");
            return (Criteria) this;
        }

        public Criteria andDpRespBattleCarLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_BATTLE_CAR <=", value, "dpRespBattleCar");
            return (Criteria) this;
        }

        public Criteria andDpRespBattleCarIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_BATTLE_CAR in", values, "dpRespBattleCar");
            return (Criteria) this;
        }

        public Criteria andDpRespBattleCarNotIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_BATTLE_CAR not in", values, "dpRespBattleCar");
            return (Criteria) this;
        }

        public Criteria andDpRespBattleCarBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_BATTLE_CAR between", value1, value2, "dpRespBattleCar");
            return (Criteria) this;
        }

        public Criteria andDpRespBattleCarNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_BATTLE_CAR not between", value1, value2, "dpRespBattleCar");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherIsNull() {
            addCriterion("DP_RESP_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherIsNotNull() {
            addCriterion("DP_RESP_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_OTHER =", value, "dpRespOther");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherNotEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_OTHER <>", value, "dpRespOther");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherGreaterThan(BigDecimal value) {
            addCriterion("DP_RESP_OTHER >", value, "dpRespOther");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_OTHER >=", value, "dpRespOther");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherLessThan(BigDecimal value) {
            addCriterion("DP_RESP_OTHER <", value, "dpRespOther");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_OTHER <=", value, "dpRespOther");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_OTHER in", values, "dpRespOther");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherNotIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_OTHER not in", values, "dpRespOther");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_OTHER between", value1, value2, "dpRespOther");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_OTHER not between", value1, value2, "dpRespOther");
            return (Criteria) this;
        }

        public Criteria andDpRespTotalFoamIsNull() {
            addCriterion("DP_RESP_TOTAL_FOAM is null");
            return (Criteria) this;
        }

        public Criteria andDpRespTotalFoamIsNotNull() {
            addCriterion("DP_RESP_TOTAL_FOAM is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespTotalFoamEqualTo(String value) {
            addCriterion("DP_RESP_TOTAL_FOAM =", value, "dpRespTotalFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespTotalFoamNotEqualTo(String value) {
            addCriterion("DP_RESP_TOTAL_FOAM <>", value, "dpRespTotalFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespTotalFoamGreaterThan(String value) {
            addCriterion("DP_RESP_TOTAL_FOAM >", value, "dpRespTotalFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespTotalFoamGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_TOTAL_FOAM >=", value, "dpRespTotalFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespTotalFoamLessThan(String value) {
            addCriterion("DP_RESP_TOTAL_FOAM <", value, "dpRespTotalFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespTotalFoamLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_TOTAL_FOAM <=", value, "dpRespTotalFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespTotalFoamLike(String value) {
            addCriterion("DP_RESP_TOTAL_FOAM like", value, "dpRespTotalFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespTotalFoamNotLike(String value) {
            addCriterion("DP_RESP_TOTAL_FOAM not like", value, "dpRespTotalFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespTotalFoamIn(List<String> values) {
            addCriterion("DP_RESP_TOTAL_FOAM in", values, "dpRespTotalFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespTotalFoamNotIn(List<String> values) {
            addCriterion("DP_RESP_TOTAL_FOAM not in", values, "dpRespTotalFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespTotalFoamBetween(String value1, String value2) {
            addCriterion("DP_RESP_TOTAL_FOAM between", value1, value2, "dpRespTotalFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespTotalFoamNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_TOTAL_FOAM not between", value1, value2, "dpRespTotalFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAFoamIsNull() {
            addCriterion("DP_RESP_A_FOAM is null");
            return (Criteria) this;
        }

        public Criteria andDpRespAFoamIsNotNull() {
            addCriterion("DP_RESP_A_FOAM is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespAFoamEqualTo(String value) {
            addCriterion("DP_RESP_A_FOAM =", value, "dpRespAFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAFoamNotEqualTo(String value) {
            addCriterion("DP_RESP_A_FOAM <>", value, "dpRespAFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAFoamGreaterThan(String value) {
            addCriterion("DP_RESP_A_FOAM >", value, "dpRespAFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAFoamGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_A_FOAM >=", value, "dpRespAFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAFoamLessThan(String value) {
            addCriterion("DP_RESP_A_FOAM <", value, "dpRespAFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAFoamLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_A_FOAM <=", value, "dpRespAFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAFoamLike(String value) {
            addCriterion("DP_RESP_A_FOAM like", value, "dpRespAFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAFoamNotLike(String value) {
            addCriterion("DP_RESP_A_FOAM not like", value, "dpRespAFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAFoamIn(List<String> values) {
            addCriterion("DP_RESP_A_FOAM in", values, "dpRespAFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAFoamNotIn(List<String> values) {
            addCriterion("DP_RESP_A_FOAM not in", values, "dpRespAFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAFoamBetween(String value1, String value2) {
            addCriterion("DP_RESP_A_FOAM between", value1, value2, "dpRespAFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAFoamNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_A_FOAM not between", value1, value2, "dpRespAFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespCommonProteinFoamIsNull() {
            addCriterion("DP_RESP_COMMON_PROTEIN_FOAM is null");
            return (Criteria) this;
        }

        public Criteria andDpRespCommonProteinFoamIsNotNull() {
            addCriterion("DP_RESP_COMMON_PROTEIN_FOAM is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespCommonProteinFoamEqualTo(String value) {
            addCriterion("DP_RESP_COMMON_PROTEIN_FOAM =", value, "dpRespCommonProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespCommonProteinFoamNotEqualTo(String value) {
            addCriterion("DP_RESP_COMMON_PROTEIN_FOAM <>", value, "dpRespCommonProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespCommonProteinFoamGreaterThan(String value) {
            addCriterion("DP_RESP_COMMON_PROTEIN_FOAM >", value, "dpRespCommonProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespCommonProteinFoamGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_COMMON_PROTEIN_FOAM >=", value, "dpRespCommonProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespCommonProteinFoamLessThan(String value) {
            addCriterion("DP_RESP_COMMON_PROTEIN_FOAM <", value, "dpRespCommonProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespCommonProteinFoamLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_COMMON_PROTEIN_FOAM <=", value, "dpRespCommonProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespCommonProteinFoamLike(String value) {
            addCriterion("DP_RESP_COMMON_PROTEIN_FOAM like", value, "dpRespCommonProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespCommonProteinFoamNotLike(String value) {
            addCriterion("DP_RESP_COMMON_PROTEIN_FOAM not like", value, "dpRespCommonProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespCommonProteinFoamIn(List<String> values) {
            addCriterion("DP_RESP_COMMON_PROTEIN_FOAM in", values, "dpRespCommonProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespCommonProteinFoamNotIn(List<String> values) {
            addCriterion("DP_RESP_COMMON_PROTEIN_FOAM not in", values, "dpRespCommonProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespCommonProteinFoamBetween(String value1, String value2) {
            addCriterion("DP_RESP_COMMON_PROTEIN_FOAM between", value1, value2, "dpRespCommonProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespCommonProteinFoamNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_COMMON_PROTEIN_FOAM not between", value1, value2, "dpRespCommonProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespVegetableProteinFoamIsNull() {
            addCriterion("DP_RESP_VEGETABLE_PROTEIN_FOAM is null");
            return (Criteria) this;
        }

        public Criteria andDpRespVegetableProteinFoamIsNotNull() {
            addCriterion("DP_RESP_VEGETABLE_PROTEIN_FOAM is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespVegetableProteinFoamEqualTo(String value) {
            addCriterion("DP_RESP_VEGETABLE_PROTEIN_FOAM =", value, "dpRespVegetableProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespVegetableProteinFoamNotEqualTo(String value) {
            addCriterion("DP_RESP_VEGETABLE_PROTEIN_FOAM <>", value, "dpRespVegetableProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespVegetableProteinFoamGreaterThan(String value) {
            addCriterion("DP_RESP_VEGETABLE_PROTEIN_FOAM >", value, "dpRespVegetableProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespVegetableProteinFoamGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_VEGETABLE_PROTEIN_FOAM >=", value, "dpRespVegetableProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespVegetableProteinFoamLessThan(String value) {
            addCriterion("DP_RESP_VEGETABLE_PROTEIN_FOAM <", value, "dpRespVegetableProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespVegetableProteinFoamLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_VEGETABLE_PROTEIN_FOAM <=", value, "dpRespVegetableProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespVegetableProteinFoamLike(String value) {
            addCriterion("DP_RESP_VEGETABLE_PROTEIN_FOAM like", value, "dpRespVegetableProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespVegetableProteinFoamNotLike(String value) {
            addCriterion("DP_RESP_VEGETABLE_PROTEIN_FOAM not like", value, "dpRespVegetableProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespVegetableProteinFoamIn(List<String> values) {
            addCriterion("DP_RESP_VEGETABLE_PROTEIN_FOAM in", values, "dpRespVegetableProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespVegetableProteinFoamNotIn(List<String> values) {
            addCriterion("DP_RESP_VEGETABLE_PROTEIN_FOAM not in", values, "dpRespVegetableProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespVegetableProteinFoamBetween(String value1, String value2) {
            addCriterion("DP_RESP_VEGETABLE_PROTEIN_FOAM between", value1, value2, "dpRespVegetableProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespVegetableProteinFoamNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_VEGETABLE_PROTEIN_FOAM not between", value1, value2, "dpRespVegetableProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAntiSolubleFoamIsNull() {
            addCriterion("DP_RESP_ANTI_SOLUBLE_FOAM is null");
            return (Criteria) this;
        }

        public Criteria andDpRespAntiSolubleFoamIsNotNull() {
            addCriterion("DP_RESP_ANTI_SOLUBLE_FOAM is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespAntiSolubleFoamEqualTo(String value) {
            addCriterion("DP_RESP_ANTI_SOLUBLE_FOAM =", value, "dpRespAntiSolubleFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAntiSolubleFoamNotEqualTo(String value) {
            addCriterion("DP_RESP_ANTI_SOLUBLE_FOAM <>", value, "dpRespAntiSolubleFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAntiSolubleFoamGreaterThan(String value) {
            addCriterion("DP_RESP_ANTI_SOLUBLE_FOAM >", value, "dpRespAntiSolubleFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAntiSolubleFoamGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_ANTI_SOLUBLE_FOAM >=", value, "dpRespAntiSolubleFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAntiSolubleFoamLessThan(String value) {
            addCriterion("DP_RESP_ANTI_SOLUBLE_FOAM <", value, "dpRespAntiSolubleFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAntiSolubleFoamLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_ANTI_SOLUBLE_FOAM <=", value, "dpRespAntiSolubleFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAntiSolubleFoamLike(String value) {
            addCriterion("DP_RESP_ANTI_SOLUBLE_FOAM like", value, "dpRespAntiSolubleFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAntiSolubleFoamNotLike(String value) {
            addCriterion("DP_RESP_ANTI_SOLUBLE_FOAM not like", value, "dpRespAntiSolubleFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAntiSolubleFoamIn(List<String> values) {
            addCriterion("DP_RESP_ANTI_SOLUBLE_FOAM in", values, "dpRespAntiSolubleFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAntiSolubleFoamNotIn(List<String> values) {
            addCriterion("DP_RESP_ANTI_SOLUBLE_FOAM not in", values, "dpRespAntiSolubleFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAntiSolubleFoamBetween(String value1, String value2) {
            addCriterion("DP_RESP_ANTI_SOLUBLE_FOAM between", value1, value2, "dpRespAntiSolubleFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespAntiSolubleFoamNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_ANTI_SOLUBLE_FOAM not between", value1, value2, "dpRespAntiSolubleFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespWaterFoamIsNull() {
            addCriterion("DP_RESP_WATER_FOAM is null");
            return (Criteria) this;
        }

        public Criteria andDpRespWaterFoamIsNotNull() {
            addCriterion("DP_RESP_WATER_FOAM is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespWaterFoamEqualTo(String value) {
            addCriterion("DP_RESP_WATER_FOAM =", value, "dpRespWaterFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespWaterFoamNotEqualTo(String value) {
            addCriterion("DP_RESP_WATER_FOAM <>", value, "dpRespWaterFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespWaterFoamGreaterThan(String value) {
            addCriterion("DP_RESP_WATER_FOAM >", value, "dpRespWaterFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespWaterFoamGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_WATER_FOAM >=", value, "dpRespWaterFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespWaterFoamLessThan(String value) {
            addCriterion("DP_RESP_WATER_FOAM <", value, "dpRespWaterFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespWaterFoamLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_WATER_FOAM <=", value, "dpRespWaterFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespWaterFoamLike(String value) {
            addCriterion("DP_RESP_WATER_FOAM like", value, "dpRespWaterFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespWaterFoamNotLike(String value) {
            addCriterion("DP_RESP_WATER_FOAM not like", value, "dpRespWaterFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespWaterFoamIn(List<String> values) {
            addCriterion("DP_RESP_WATER_FOAM in", values, "dpRespWaterFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespWaterFoamNotIn(List<String> values) {
            addCriterion("DP_RESP_WATER_FOAM not in", values, "dpRespWaterFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespWaterFoamBetween(String value1, String value2) {
            addCriterion("DP_RESP_WATER_FOAM between", value1, value2, "dpRespWaterFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespWaterFoamNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_WATER_FOAM not between", value1, value2, "dpRespWaterFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFluorineProteinFoamIsNull() {
            addCriterion("DP_RESP_FLUORINE_PROTEIN_FOAM is null");
            return (Criteria) this;
        }

        public Criteria andDpRespFluorineProteinFoamIsNotNull() {
            addCriterion("DP_RESP_FLUORINE_PROTEIN_FOAM is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespFluorineProteinFoamEqualTo(String value) {
            addCriterion("DP_RESP_FLUORINE_PROTEIN_FOAM =", value, "dpRespFluorineProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFluorineProteinFoamNotEqualTo(String value) {
            addCriterion("DP_RESP_FLUORINE_PROTEIN_FOAM <>", value, "dpRespFluorineProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFluorineProteinFoamGreaterThan(String value) {
            addCriterion("DP_RESP_FLUORINE_PROTEIN_FOAM >", value, "dpRespFluorineProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFluorineProteinFoamGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_FLUORINE_PROTEIN_FOAM >=", value, "dpRespFluorineProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFluorineProteinFoamLessThan(String value) {
            addCriterion("DP_RESP_FLUORINE_PROTEIN_FOAM <", value, "dpRespFluorineProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFluorineProteinFoamLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_FLUORINE_PROTEIN_FOAM <=", value, "dpRespFluorineProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFluorineProteinFoamLike(String value) {
            addCriterion("DP_RESP_FLUORINE_PROTEIN_FOAM like", value, "dpRespFluorineProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFluorineProteinFoamNotLike(String value) {
            addCriterion("DP_RESP_FLUORINE_PROTEIN_FOAM not like", value, "dpRespFluorineProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFluorineProteinFoamIn(List<String> values) {
            addCriterion("DP_RESP_FLUORINE_PROTEIN_FOAM in", values, "dpRespFluorineProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFluorineProteinFoamNotIn(List<String> values) {
            addCriterion("DP_RESP_FLUORINE_PROTEIN_FOAM not in", values, "dpRespFluorineProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFluorineProteinFoamBetween(String value1, String value2) {
            addCriterion("DP_RESP_FLUORINE_PROTEIN_FOAM between", value1, value2, "dpRespFluorineProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFluorineProteinFoamNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_FLUORINE_PROTEIN_FOAM not between", value1, value2, "dpRespFluorineProteinFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespHighExpansionFoamIsNull() {
            addCriterion("DP_RESP_HIGH_EXPANSION_FOAM is null");
            return (Criteria) this;
        }

        public Criteria andDpRespHighExpansionFoamIsNotNull() {
            addCriterion("DP_RESP_HIGH_EXPANSION_FOAM is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespHighExpansionFoamEqualTo(String value) {
            addCriterion("DP_RESP_HIGH_EXPANSION_FOAM =", value, "dpRespHighExpansionFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespHighExpansionFoamNotEqualTo(String value) {
            addCriterion("DP_RESP_HIGH_EXPANSION_FOAM <>", value, "dpRespHighExpansionFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespHighExpansionFoamGreaterThan(String value) {
            addCriterion("DP_RESP_HIGH_EXPANSION_FOAM >", value, "dpRespHighExpansionFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespHighExpansionFoamGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_HIGH_EXPANSION_FOAM >=", value, "dpRespHighExpansionFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespHighExpansionFoamLessThan(String value) {
            addCriterion("DP_RESP_HIGH_EXPANSION_FOAM <", value, "dpRespHighExpansionFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespHighExpansionFoamLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_HIGH_EXPANSION_FOAM <=", value, "dpRespHighExpansionFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespHighExpansionFoamLike(String value) {
            addCriterion("DP_RESP_HIGH_EXPANSION_FOAM like", value, "dpRespHighExpansionFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespHighExpansionFoamNotLike(String value) {
            addCriterion("DP_RESP_HIGH_EXPANSION_FOAM not like", value, "dpRespHighExpansionFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespHighExpansionFoamIn(List<String> values) {
            addCriterion("DP_RESP_HIGH_EXPANSION_FOAM in", values, "dpRespHighExpansionFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespHighExpansionFoamNotIn(List<String> values) {
            addCriterion("DP_RESP_HIGH_EXPANSION_FOAM not in", values, "dpRespHighExpansionFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespHighExpansionFoamBetween(String value1, String value2) {
            addCriterion("DP_RESP_HIGH_EXPANSION_FOAM between", value1, value2, "dpRespHighExpansionFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespHighExpansionFoamNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_HIGH_EXPANSION_FOAM not between", value1, value2, "dpRespHighExpansionFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFivezeroFoamIsNull() {
            addCriterion("DP_RESP_FIVEZERO_FOAM is null");
            return (Criteria) this;
        }

        public Criteria andDpRespFivezeroFoamIsNotNull() {
            addCriterion("DP_RESP_FIVEZERO_FOAM is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespFivezeroFoamEqualTo(String value) {
            addCriterion("DP_RESP_FIVEZERO_FOAM =", value, "dpRespFivezeroFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFivezeroFoamNotEqualTo(String value) {
            addCriterion("DP_RESP_FIVEZERO_FOAM <>", value, "dpRespFivezeroFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFivezeroFoamGreaterThan(String value) {
            addCriterion("DP_RESP_FIVEZERO_FOAM >", value, "dpRespFivezeroFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFivezeroFoamGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_FIVEZERO_FOAM >=", value, "dpRespFivezeroFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFivezeroFoamLessThan(String value) {
            addCriterion("DP_RESP_FIVEZERO_FOAM <", value, "dpRespFivezeroFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFivezeroFoamLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_FIVEZERO_FOAM <=", value, "dpRespFivezeroFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFivezeroFoamLike(String value) {
            addCriterion("DP_RESP_FIVEZERO_FOAM like", value, "dpRespFivezeroFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFivezeroFoamNotLike(String value) {
            addCriterion("DP_RESP_FIVEZERO_FOAM not like", value, "dpRespFivezeroFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFivezeroFoamIn(List<String> values) {
            addCriterion("DP_RESP_FIVEZERO_FOAM in", values, "dpRespFivezeroFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFivezeroFoamNotIn(List<String> values) {
            addCriterion("DP_RESP_FIVEZERO_FOAM not in", values, "dpRespFivezeroFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFivezeroFoamBetween(String value1, String value2) {
            addCriterion("DP_RESP_FIVEZERO_FOAM between", value1, value2, "dpRespFivezeroFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespFivezeroFoamNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_FIVEZERO_FOAM not between", value1, value2, "dpRespFivezeroFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespDteFoamIsNull() {
            addCriterion("DP_RESP_DTE_FOAM is null");
            return (Criteria) this;
        }

        public Criteria andDpRespDteFoamIsNotNull() {
            addCriterion("DP_RESP_DTE_FOAM is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespDteFoamEqualTo(String value) {
            addCriterion("DP_RESP_DTE_FOAM =", value, "dpRespDteFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespDteFoamNotEqualTo(String value) {
            addCriterion("DP_RESP_DTE_FOAM <>", value, "dpRespDteFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespDteFoamGreaterThan(String value) {
            addCriterion("DP_RESP_DTE_FOAM >", value, "dpRespDteFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespDteFoamGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DTE_FOAM >=", value, "dpRespDteFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespDteFoamLessThan(String value) {
            addCriterion("DP_RESP_DTE_FOAM <", value, "dpRespDteFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespDteFoamLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DTE_FOAM <=", value, "dpRespDteFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespDteFoamLike(String value) {
            addCriterion("DP_RESP_DTE_FOAM like", value, "dpRespDteFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespDteFoamNotLike(String value) {
            addCriterion("DP_RESP_DTE_FOAM not like", value, "dpRespDteFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespDteFoamIn(List<String> values) {
            addCriterion("DP_RESP_DTE_FOAM in", values, "dpRespDteFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespDteFoamNotIn(List<String> values) {
            addCriterion("DP_RESP_DTE_FOAM not in", values, "dpRespDteFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespDteFoamBetween(String value1, String value2) {
            addCriterion("DP_RESP_DTE_FOAM between", value1, value2, "dpRespDteFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespDteFoamNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_DTE_FOAM not between", value1, value2, "dpRespDteFoam");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherFoarmIsNull() {
            addCriterion("DP_RESP_OTHER_FOARM is null");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherFoarmIsNotNull() {
            addCriterion("DP_RESP_OTHER_FOARM is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherFoarmEqualTo(String value) {
            addCriterion("DP_RESP_OTHER_FOARM =", value, "dpRespOtherFoarm");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherFoarmNotEqualTo(String value) {
            addCriterion("DP_RESP_OTHER_FOARM <>", value, "dpRespOtherFoarm");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherFoarmGreaterThan(String value) {
            addCriterion("DP_RESP_OTHER_FOARM >", value, "dpRespOtherFoarm");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherFoarmGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_OTHER_FOARM >=", value, "dpRespOtherFoarm");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherFoarmLessThan(String value) {
            addCriterion("DP_RESP_OTHER_FOARM <", value, "dpRespOtherFoarm");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherFoarmLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_OTHER_FOARM <=", value, "dpRespOtherFoarm");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherFoarmLike(String value) {
            addCriterion("DP_RESP_OTHER_FOARM like", value, "dpRespOtherFoarm");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherFoarmNotLike(String value) {
            addCriterion("DP_RESP_OTHER_FOARM not like", value, "dpRespOtherFoarm");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherFoarmIn(List<String> values) {
            addCriterion("DP_RESP_OTHER_FOARM in", values, "dpRespOtherFoarm");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherFoarmNotIn(List<String> values) {
            addCriterion("DP_RESP_OTHER_FOARM not in", values, "dpRespOtherFoarm");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherFoarmBetween(String value1, String value2) {
            addCriterion("DP_RESP_OTHER_FOARM between", value1, value2, "dpRespOtherFoarm");
            return (Criteria) this;
        }

        public Criteria andDpRespOtherFoarmNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_OTHER_FOARM not between", value1, value2, "dpRespOtherFoarm");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedIsNull() {
            addCriterion("DP_RESP_ABBREVIATED is null");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedIsNotNull() {
            addCriterion("DP_RESP_ABBREVIATED is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedEqualTo(String value) {
            addCriterion("DP_RESP_ABBREVIATED =", value, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedNotEqualTo(String value) {
            addCriterion("DP_RESP_ABBREVIATED <>", value, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedGreaterThan(String value) {
            addCriterion("DP_RESP_ABBREVIATED >", value, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_ABBREVIATED >=", value, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedLessThan(String value) {
            addCriterion("DP_RESP_ABBREVIATED <", value, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_ABBREVIATED <=", value, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedLike(String value) {
            addCriterion("DP_RESP_ABBREVIATED like", value, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedNotLike(String value) {
            addCriterion("DP_RESP_ABBREVIATED not like", value, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedIn(List<String> values) {
            addCriterion("DP_RESP_ABBREVIATED in", values, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedNotIn(List<String> values) {
            addCriterion("DP_RESP_ABBREVIATED not in", values, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedBetween(String value1, String value2) {
            addCriterion("DP_RESP_ABBREVIATED between", value1, value2, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_ABBREVIATED not between", value1, value2, "dpRespAbbreviated");
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