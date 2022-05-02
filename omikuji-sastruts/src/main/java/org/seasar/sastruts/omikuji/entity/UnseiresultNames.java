package org.seasar.sastruts.omikuji.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Unseiresult}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2022/05/02 14:19:09")
public class UnseiresultNames {

    /**
     * uranaidateのプロパティ名を返します。
     * 
     * @return uranaidateのプロパティ名
     */
    public static PropertyName<String> uranaidate() {
        return new PropertyName<String>("uranaidate");
    }

    /**
     * birthdayのプロパティ名を返します。
     * 
     * @return birthdayのプロパティ名
     */
    public static PropertyName<String> birthday() {
        return new PropertyName<String>("birthday");
    }

    /**
     * omikujicodeのプロパティ名を返します。
     * 
     * @return omikujicodeのプロパティ名
     */
    public static PropertyName<String> omikujicode() {
        return new PropertyName<String>("omikujicode");
    }

    /**
     * renewalwriterのプロパティ名を返します。
     * 
     * @return renewalwriterのプロパティ名
     */
    public static PropertyName<String> renewalwriter() {
        return new PropertyName<String>("renewalwriter");
    }

    /**
     * renewaldateのプロパティ名を返します。
     * 
     * @return renewaldateのプロパティ名
     */
    public static PropertyName<String> renewaldate() {
        return new PropertyName<String>("renewaldate");
    }

    /**
     * unseiwriterのプロパティ名を返します。
     * 
     * @return unseiwriterのプロパティ名
     */
    public static PropertyName<String> unseiwriter() {
        return new PropertyName<String>("unseiwriter");
    }

    /**
     * unseiwritedateのプロパティ名を返します。
     * 
     * @return unseiwritedateのプロパティ名
     */
    public static PropertyName<String> unseiwritedate() {
        return new PropertyName<String>("unseiwritedate");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _UnseiresultNames extends PropertyName<Unseiresult> {

        /**
         * インスタンスを構築します。
         */
        public _UnseiresultNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _UnseiresultNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _UnseiresultNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * uranaidateのプロパティ名を返します。
         *
         * @return uranaidateのプロパティ名
         */
        public PropertyName<String> uranaidate() {
            return new PropertyName<String>(this, "uranaidate");
        }

        /**
         * birthdayのプロパティ名を返します。
         *
         * @return birthdayのプロパティ名
         */
        public PropertyName<String> birthday() {
            return new PropertyName<String>(this, "birthday");
        }

        /**
         * omikujicodeのプロパティ名を返します。
         *
         * @return omikujicodeのプロパティ名
         */
        public PropertyName<String> omikujicode() {
            return new PropertyName<String>(this, "omikujicode");
        }

        /**
         * renewalwriterのプロパティ名を返します。
         *
         * @return renewalwriterのプロパティ名
         */
        public PropertyName<String> renewalwriter() {
            return new PropertyName<String>(this, "renewalwriter");
        }

        /**
         * renewaldateのプロパティ名を返します。
         *
         * @return renewaldateのプロパティ名
         */
        public PropertyName<String> renewaldate() {
            return new PropertyName<String>(this, "renewaldate");
        }

        /**
         * unseiwriterのプロパティ名を返します。
         *
         * @return unseiwriterのプロパティ名
         */
        public PropertyName<String> unseiwriter() {
            return new PropertyName<String>(this, "unseiwriter");
        }

        /**
         * unseiwritedateのプロパティ名を返します。
         *
         * @return unseiwritedateのプロパティ名
         */
        public PropertyName<String> unseiwritedate() {
            return new PropertyName<String>(this, "unseiwritedate");
        }
    }
}