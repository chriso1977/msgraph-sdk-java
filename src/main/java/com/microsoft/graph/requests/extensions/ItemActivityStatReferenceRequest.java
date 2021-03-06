// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Activity Stat Reference Request.
 */
public class ItemActivityStatReferenceRequest extends BaseRequest implements IItemActivityStatReferenceRequest {

    /**
     * The request for the ItemActivityStat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemActivityStatReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemActivityStat.class);
    }

    public void delete(final ICallback<ItemActivityStat> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public ItemActivityStat delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IItemActivityStatReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (ItemActivityStatReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IItemActivityStatReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (ItemActivityStatReferenceRequest)this;
    }
    /**
     * Puts the ItemActivityStat
     *
     * @param srcItemActivityStat the ItemActivityStat reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(ItemActivityStat srcItemActivityStat, final ICallback<ItemActivityStat> callback) {
        send(HttpMethod.PUT, callback, srcItemActivityStat);
    }

    /**
     * Puts the ItemActivityStat
     *
     * @param srcItemActivityStat the ItemActivityStat reference to PUT
     * @return the ItemActivityStat
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public ItemActivityStat put(ItemActivityStat srcItemActivityStat) throws ClientException {
        return send(HttpMethod.PUT, srcItemActivityStat);
    }
}
