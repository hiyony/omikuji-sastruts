package org.seasar.sastruts.omikuji.entity;

import javax.annotation.Generated;
import org.seasar.sastruts.omikuji.entity.FortunemasterNames._FortunemasterNames;
import org.seasar.sastruts.omikuji.entity.OmikujiiNames._OmikujiiNames;
import org.seasar.sastruts.omikuji.entity.UnseiresultNames._UnseiresultNames;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2022/05/02 14:19:09")
public class Names {

    /**
     * {@link Fortunemaster}の名前クラスを返します。
     * 
     * @return Fortunemasterの名前クラス
     */
    public static _FortunemasterNames fortunemaster() {
        return new _FortunemasterNames();
    }

    /**
     * {@link Omikujii}の名前クラスを返します。
     * 
     * @return Omikujiiの名前クラス
     */
    public static _OmikujiiNames omikujii() {
        return new _OmikujiiNames();
    }

    /**
     * {@link Unseiresult}の名前クラスを返します。
     * 
     * @return Unseiresultの名前クラス
     */
    public static _UnseiresultNames unseiresult() {
        return new _UnseiresultNames();
    }
}