package org.seasar.sastruts.omikuji.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Omikujii}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2022/05/02 14:19:09")
public class OmikujiiNames {

    /**
     * omikujicodeのプロパティ名を返します。
     * 
     * @return omikujicodeのプロパティ名
     */
    public static PropertyName<String> omikujicode() {
        return new PropertyName<String>("omikujicode");
    }

    /**
     * unseicodeのプロパティ名を返します。
     * 
     * @return unseicodeのプロパティ名
     */
    public static PropertyName<String> unseicode() {
        return new PropertyName<String>("unseicode");
    }

    /**
     * negaigotoのプロパティ名を返します。
     * 
     * @return negaigotoのプロパティ名
     */
    public static PropertyName<String> negaigoto() {
        return new PropertyName<String>("negaigoto");
    }

    /**
     * akinaiのプロパティ名を返します。
     * 
     * @return akinaiのプロパティ名
     */
    public static PropertyName<String> akinai() {
        return new PropertyName<String>("akinai");
    }

    /**
     * gakumonのプロパティ名を返します。
     * 
     * @return gakumonのプロパティ名
     */
    public static PropertyName<String> gakumon() {
        return new PropertyName<String>("gakumon");
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
    public static class _OmikujiiNames extends PropertyName<Omikujii> {

        /**
         * インスタンスを構築します。
         */
        public _OmikujiiNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _OmikujiiNames(final String name) {
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
        public _OmikujiiNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
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
         * unseicodeのプロパティ名を返します。
         *
         * @return unseicodeのプロパティ名
         */
        public PropertyName<String> unseicode() {
            return new PropertyName<String>(this, "unseicode");
        }

        /**
         * negaigotoのプロパティ名を返します。
         *
         * @return negaigotoのプロパティ名
         */
        public PropertyName<String> negaigoto() {
            return new PropertyName<String>(this, "negaigoto");
        }

        /**
         * akinaiのプロパティ名を返します。
         *
         * @return akinaiのプロパティ名
         */
        public PropertyName<String> akinai() {
            return new PropertyName<String>(this, "akinai");
        }

        /**
         * gakumonのプロパティ名を返します。
         *
         * @return gakumonのプロパティ名
         */
        public PropertyName<String> gakumon() {
            return new PropertyName<String>(this, "gakumon");
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