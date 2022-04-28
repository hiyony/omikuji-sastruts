package org.seasar.sastruts.omikuji.service;

import org.seasar.sastruts.omikuji.entity.Unseiresult;

public class UnseiresultService extends AbstractPostgresService<Unseiresult> {

    public Unseiresult findById() {
        return select().id().getSingleResult();
    }
}