package org.seasar.sastruts.omikuji.service;

import org.seasar.sastruts.omikuji.entity.Omikujii;

public class OmikujiiService extends AbstractPostgresService<Omikujii> {

    public Omikujii findById() {
        return select().id().getSingleResult();
    }
}