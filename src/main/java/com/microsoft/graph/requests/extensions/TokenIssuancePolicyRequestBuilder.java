// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyRequest;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Token Issuance Policy Request Builder.
 */
public class TokenIssuancePolicyRequestBuilder extends BaseRequestBuilder implements ITokenIssuancePolicyRequestBuilder {

    /**
     * The request builder for the TokenIssuancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TokenIssuancePolicyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the ITokenIssuancePolicyRequest instance
     */
    public ITokenIssuancePolicyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ITokenIssuancePolicyRequest instance
     */
    public ITokenIssuancePolicyRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new TokenIssuancePolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }


}

