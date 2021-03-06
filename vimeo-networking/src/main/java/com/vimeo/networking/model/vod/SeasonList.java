package com.vimeo.networking.model.vod;

import com.vimeo.networking.model.BaseResponseList;

/**
 * A list of {@link Season} items
 * Created by zetterstromk on 10/4/16.
 */
public class SeasonList extends BaseResponseList<Season> {

    private static final long serialVersionUID = -2072805722241898821L;

    @Override
    public Class<Season> getModelClass() {
        return Season.class;
    }
}
