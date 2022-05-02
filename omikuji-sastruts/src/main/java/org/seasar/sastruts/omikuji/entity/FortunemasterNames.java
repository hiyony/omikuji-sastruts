package org.seasar.sastruts.omikuji.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Fortunemaster}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2022/05/02 14:19:09")
public class FortunemasterNames {

    /**
     * unseinameのプロパティ名を返します。
     * 
     * @return unseinameのプロパティ名
     */
    public static PropertyName<String> unseiname() {
        return new PropertyName<String>("unseiname");
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
    public static class _FortunemasterNames extends PropertyName<Fortunemaster> {

        /**
         * インスタンスを構築します。
         */
        public _FortunemasterNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _FortunemasterNames(final String name) {
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
        public _FortunemasterNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * unseinameのプロパティ名を返します。
         *
         * @return unseinameのプロパティ名
         */
        public PropertyName<String> unseiname() {
            return new PropertyName<String>(this, "unseiname");
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