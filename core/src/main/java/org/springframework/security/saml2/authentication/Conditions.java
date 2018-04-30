/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.springframework.security.saml2.authentication;

import org.joda.time.DateTime;

public class Conditions {

    private DateTime notBefore;
    private DateTime notOnOrAfter;

    public DateTime getNotBefore() {
        return notBefore;
    }

    public Conditions setNotBefore(DateTime notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    public DateTime getNotOnOrAfter() {
        return notOnOrAfter;
    }

    public Conditions setNotOnOrAfter(DateTime notOnOrAfter) {
        this.notOnOrAfter = notOnOrAfter;
        return this;
    }
}
