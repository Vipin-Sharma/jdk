/*
 * Copyright (c) 2006, 2013, 2020, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package java.sql;

/**
 * The subclass of {@link SQLException} thrown in situations where a
 * previously failed operation might be able to succeed if the application performs
 *  some recovery steps and retries the entire transaction or in the case of a
 * distributed transaction, the transaction branch.  At a minimum,
 * the recovery operation must include closing the current connection and getting
 * a new connection.
 *
 * @since 1.6
 */
public class SQLRecoverableException extends java.sql.SQLException {

        /**
         * Constructs a {@code SQLRecoverableException} object.
         * The {@code reason}, {@code SQLState} are initialized
         * to {@code null} and the vendor code is initialized to 0.
         *
         * The {@code cause} is not initialized, and may subsequently be
         * initialized by a call to the
         * {@link Throwable#initCause(java.lang.Throwable)} method.
         *
         * @since 1.6
        */
        public SQLRecoverableException() {
                super();
        }

        /**
         * Constructs a {@code SQLRecoverableException} object
         *  with a given {@code reason}. The {@code SQLState}
         * is initialized to {@code null} and the vendor code is initialized
         * to 0.
         *
         * The {@code cause} is not initialized, and may subsequently be
         * initialized by a call to the
         * {@link Throwable#initCause(java.lang.Throwable)} method.
         *
         * @param reason a description of the exception
         * @since 1.6
         */
        public SQLRecoverableException(String reason) {
                super(reason);
        }

        /**
         * Constructs a {@code SQLRecoverableException} object
         * with a given {@code reason} and {@code SQLState}.
         *
         * The {@code cause} is not initialized, and may subsequently be
         * initialized by a call to the
         * {@link Throwable#initCause(java.lang.Throwable)} method. The vendor code
         * is initialized to 0.
         *
         * @param reason a description of the exception
         * @param SQLState an XOPEN or SQL:2003 code identifying the exception
         * @since 1.6
         */
        public SQLRecoverableException(String reason, String SQLState) {
                super(reason, SQLState);
        }

        /**
         * Constructs a {@code SQLRecoverableException} object
         *  with a given {@code reason}, {@code SQLState}  and
         * {@code vendorCode}.
         *
         * The {@code cause} is not initialized, and may subsequently be
         * initialized by a call to the
         * {@link Throwable#initCause(java.lang.Throwable)} method.
         *
         * @param reason a description of the exception
         * @param SQLState an XOPEN or SQL:2003 code identifying the exception
         * @param vendorCode a database vendor specific exception code
         * @since 1.6
         */
        public SQLRecoverableException(String reason, String SQLState, int vendorCode) {
                super(reason, SQLState, vendorCode);
        }

    /**
     * Constructs a {@code SQLRecoverableException} object
     * with a given  {@code cause}.
     * The {@code SQLState} is initialized
     * to {@code null} and the vendor code is initialized to 0.
     * The {@code reason}  is initialized to {@code null} if
     * {@code cause==null} or to {@code cause.toString()} if
     * {@code cause!=null}.
     *
     * @param cause the underlying reason for this {@code SQLException} (which is saved for later retrieval by the {@code getCause()} method); may be null indicating
     *     the cause is non-existent or unknown.
     * @since 1.6
     */
    public SQLRecoverableException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a {@code SQLRecoverableException} object
     * with a given
     * {@code reason} and  {@code cause}.
     * The {@code SQLState} is  initialized to {@code null}
     * and the vendor code is initialized to 0.
     *
     * @param reason a description of the exception.
     * @param cause the underlying reason for this {@code SQLException} (which is saved for later retrieval by the {@code getCause()} method); may be null indicating
     *     the cause is non-existent or unknown.
     * @since 1.6
     */
    public SQLRecoverableException(String reason, Throwable cause) {
        super(reason, cause);
    }

    /**
     * Constructs a {@code SQLRecoverableException} object
     * with a given
     * {@code reason}, {@code SQLState} and  {@code cause}.
     * The vendor code is initialized to 0.
     *
     * @param reason a description of the exception.
     * @param SQLState an XOPEN or SQL:2003 code identifying the exception
     * @param cause the underlying reason for this {@code SQLException} (which is saved for later retrieval by the {@code getCause()} method); may be null indicating
     *     the cause is non-existent or unknown.
     * @since 1.6
     */
    public SQLRecoverableException(String reason, String SQLState, Throwable cause) {
        super(reason, SQLState, cause);
    }

    /**
     *  Constructs a {@code SQLRecoverableException} object
     * with a given
     * {@code reason}, {@code SQLState}, {@code vendorCode}
     * and  {@code cause}.
     *
     * @param reason a description of the exception
     * @param SQLState an XOPEN or SQL:2003 code identifying the exception
     * @param vendorCode a database vendor-specific exception code
     * @param cause the underlying reason for this {@code SQLException} (which is saved for later retrieval by the {@code getCause()} method); may be null indicating
     *     the cause is non-existent or unknown.
     * @since 1.6
     */
    public SQLRecoverableException(String reason, String SQLState, int vendorCode, Throwable cause) {
        super(reason, SQLState, vendorCode, cause);
    }

   private static final long serialVersionUID = -4144386502923131579L;
}
