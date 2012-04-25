/*
 * File:         FBCode.java
 * Author:       Robert Bittle <guywithnose@gmail.com>
 */
package facebook.tests.helpers;

import org.json.JSONObject;
import facebook.Facebook;

/**
 * The Class FBCode.
 */
public class FBCode extends Facebook {
  
  /**
   * Instantiates a new fB code.
   *
   * @param config the config
   */
  public FBCode(JSONObject config)
  {
    super(config);
  }

  /**
   * Public get code.
   *
   * @return the string
   */
  public String publicGetCode() {
    return getCode();
  }

  /**
   * Sets the csrf state token.
   */
  public void setCSRFStateToken() {
    establishCSRFTokenState();
  }

  /**
   * Get CSRF state token.
   *
   * @return the CSRF state token
   */
  public String getCSRFStateToken() {
    return getPersistentData("state");
  }
}