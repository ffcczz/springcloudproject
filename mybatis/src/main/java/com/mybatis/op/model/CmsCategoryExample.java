package com.mybatis.op.model;

import java.util.ArrayList;
import java.util.List;

public class CmsCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsCategoryExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCataCodeIsNull() {
            addCriterion("cata_code is null");
            return (Criteria) this;
        }

        public Criteria andCataCodeIsNotNull() {
            addCriterion("cata_code is not null");
            return (Criteria) this;
        }

        public Criteria andCataCodeEqualTo(String value) {
            addCriterion("cata_code =", value, "cataCode");
            return (Criteria) this;
        }

        public Criteria andCataCodeNotEqualTo(String value) {
            addCriterion("cata_code <>", value, "cataCode");
            return (Criteria) this;
        }

        public Criteria andCataCodeGreaterThan(String value) {
            addCriterion("cata_code >", value, "cataCode");
            return (Criteria) this;
        }

        public Criteria andCataCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cata_code >=", value, "cataCode");
            return (Criteria) this;
        }

        public Criteria andCataCodeLessThan(String value) {
            addCriterion("cata_code <", value, "cataCode");
            return (Criteria) this;
        }

        public Criteria andCataCodeLessThanOrEqualTo(String value) {
            addCriterion("cata_code <=", value, "cataCode");
            return (Criteria) this;
        }

        public Criteria andCataCodeLike(String value) {
            addCriterion("cata_code like", value, "cataCode");
            return (Criteria) this;
        }

        public Criteria andCataCodeNotLike(String value) {
            addCriterion("cata_code not like", value, "cataCode");
            return (Criteria) this;
        }

        public Criteria andCataCodeIn(List<String> values) {
            addCriterion("cata_code in", values, "cataCode");
            return (Criteria) this;
        }

        public Criteria andCataCodeNotIn(List<String> values) {
            addCriterion("cata_code not in", values, "cataCode");
            return (Criteria) this;
        }

        public Criteria andCataCodeBetween(String value1, String value2) {
            addCriterion("cata_code between", value1, value2, "cataCode");
            return (Criteria) this;
        }

        public Criteria andCataCodeNotBetween(String value1, String value2) {
            addCriterion("cata_code not between", value1, value2, "cataCode");
            return (Criteria) this;
        }

        public Criteria andCataNameIsNull() {
            addCriterion("cata_name is null");
            return (Criteria) this;
        }

        public Criteria andCataNameIsNotNull() {
            addCriterion("cata_name is not null");
            return (Criteria) this;
        }

        public Criteria andCataNameEqualTo(String value) {
            addCriterion("cata_name =", value, "cataName");
            return (Criteria) this;
        }

        public Criteria andCataNameNotEqualTo(String value) {
            addCriterion("cata_name <>", value, "cataName");
            return (Criteria) this;
        }

        public Criteria andCataNameGreaterThan(String value) {
            addCriterion("cata_name >", value, "cataName");
            return (Criteria) this;
        }

        public Criteria andCataNameGreaterThanOrEqualTo(String value) {
            addCriterion("cata_name >=", value, "cataName");
            return (Criteria) this;
        }

        public Criteria andCataNameLessThan(String value) {
            addCriterion("cata_name <", value, "cataName");
            return (Criteria) this;
        }

        public Criteria andCataNameLessThanOrEqualTo(String value) {
            addCriterion("cata_name <=", value, "cataName");
            return (Criteria) this;
        }

        public Criteria andCataNameLike(String value) {
            addCriterion("cata_name like", value, "cataName");
            return (Criteria) this;
        }

        public Criteria andCataNameNotLike(String value) {
            addCriterion("cata_name not like", value, "cataName");
            return (Criteria) this;
        }

        public Criteria andCataNameIn(List<String> values) {
            addCriterion("cata_name in", values, "cataName");
            return (Criteria) this;
        }

        public Criteria andCataNameNotIn(List<String> values) {
            addCriterion("cata_name not in", values, "cataName");
            return (Criteria) this;
        }

        public Criteria andCataNameBetween(String value1, String value2) {
            addCriterion("cata_name between", value1, value2, "cataName");
            return (Criteria) this;
        }

        public Criteria andCataNameNotBetween(String value1, String value2) {
            addCriterion("cata_name not between", value1, value2, "cataName");
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