package org.seasar.sastruts.omikuji.service;

import org.seasar.sastruts.omikuji.entity.Fortunemaster;

public class FortunemasterService extends AbstractPostgresService<Fortunemaster> {

    public Fortunemaster findById() {
        return select().id().getSingleResult();
    }
}