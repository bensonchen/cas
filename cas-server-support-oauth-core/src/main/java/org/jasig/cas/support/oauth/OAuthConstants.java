package org.jasig.cas.support.oauth;

/**
 * This class has the main constants for the OAuth implementation.
 *
 * @author Jerome Leleu
 * @since 3.5.0
 */
public interface OAuthConstants {

    /** OAuth 2 endpoint in CAS. */
    String ENDPOINT_OAUTH2 = "/oauth2.0/*";

    /** Base OAuth 2.0 url. */
    String BASE_OAUTH20_URL = "/oauth2.0";

    /** The redirect uri. */
    String REDIRECT_URI = "redirect_uri";

    /** The response type. */
    String RESPONSE_TYPE = "response_type";

    /** The client id. */
    String CLIENT_ID = "client_id";

    /** The client secret. */
    String CLIENT_SECRET = "client_secret";

    /** The approval prompt. */
    String BYPASS_APPROVAL_PROMPT = "bypass_approval_prompt";

    /** The code. */
    String CODE = "code";

    /** The state. */
    String STATE = "state";

    /** The access token. */
    String ACCESS_TOKEN = "access_token";

    /** The bearer token. */
    String BEARER_TOKEN = "Bearer";

    /** The missing access token. */
    String MISSING_ACCESS_TOKEN = "missing_accessToken";

    /** The expired access token. */
    String EXPIRED_ACCESS_TOKEN = "expired_accessToken";

    /** The confirm view. */
    String CONFIRM_VIEW = "oauthConfirmView";

    /** The error view. */
    String ERROR_VIEW = "serviceErrorView";

    /** The invalid request. */
    String INVALID_REQUEST = "invalid_request";

    /** The invalid grant. */
    String INVALID_GRANT = "invalid_grant";

    /** The authorize url. */
    String AUTHORIZE_URL = "authorize";

    /** The callback authorize url. */
    String CALLBACK_AUTHORIZE_URL = "callbackAuthorize";

    /** The callback authorize url definition. */
    String CALLBACK_AUTHORIZE_URL_DEFINITION = "callbackAuthorize.*";

    /** The access token url. */
    String ACCESS_TOKEN_URL = "accessToken";

    /** The profile url. */
    String PROFILE_URL = "profile";

    /** The remaining time in seconds before expiration with syntax : expires=3600... */
    String EXPIRES = "expires";
}
