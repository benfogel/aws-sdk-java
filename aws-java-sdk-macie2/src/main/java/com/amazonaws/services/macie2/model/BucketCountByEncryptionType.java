/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The total number of buckets, grouped by server-side encryption type. This object also reports the total number of
 * buckets that aren't encrypted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/BucketCountByEncryptionType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BucketCountByEncryptionType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private Long kmsManaged;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private Long s3Managed;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private Long unencrypted;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param kmsManaged
     *        Reserved for future use.
     */

    public void setKmsManaged(Long kmsManaged) {
        this.kmsManaged = kmsManaged;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public Long getKmsManaged() {
        return this.kmsManaged;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param kmsManaged
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCountByEncryptionType withKmsManaged(Long kmsManaged) {
        setKmsManaged(kmsManaged);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param s3Managed
     *        Reserved for future use.
     */

    public void setS3Managed(Long s3Managed) {
        this.s3Managed = s3Managed;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public Long getS3Managed() {
        return this.s3Managed;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param s3Managed
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCountByEncryptionType withS3Managed(Long s3Managed) {
        setS3Managed(s3Managed);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param unencrypted
     *        Reserved for future use.
     */

    public void setUnencrypted(Long unencrypted) {
        this.unencrypted = unencrypted;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public Long getUnencrypted() {
        return this.unencrypted;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param unencrypted
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCountByEncryptionType withUnencrypted(Long unencrypted) {
        setUnencrypted(unencrypted);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKmsManaged() != null)
            sb.append("KmsManaged: ").append(getKmsManaged()).append(",");
        if (getS3Managed() != null)
            sb.append("S3Managed: ").append(getS3Managed()).append(",");
        if (getUnencrypted() != null)
            sb.append("Unencrypted: ").append(getUnencrypted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketCountByEncryptionType == false)
            return false;
        BucketCountByEncryptionType other = (BucketCountByEncryptionType) obj;
        if (other.getKmsManaged() == null ^ this.getKmsManaged() == null)
            return false;
        if (other.getKmsManaged() != null && other.getKmsManaged().equals(this.getKmsManaged()) == false)
            return false;
        if (other.getS3Managed() == null ^ this.getS3Managed() == null)
            return false;
        if (other.getS3Managed() != null && other.getS3Managed().equals(this.getS3Managed()) == false)
            return false;
        if (other.getUnencrypted() == null ^ this.getUnencrypted() == null)
            return false;
        if (other.getUnencrypted() != null && other.getUnencrypted().equals(this.getUnencrypted()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsManaged() == null) ? 0 : getKmsManaged().hashCode());
        hashCode = prime * hashCode + ((getS3Managed() == null) ? 0 : getS3Managed().hashCode());
        hashCode = prime * hashCode + ((getUnencrypted() == null) ? 0 : getUnencrypted().hashCode());
        return hashCode;
    }

    @Override
    public BucketCountByEncryptionType clone() {
        try {
            return (BucketCountByEncryptionType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.BucketCountByEncryptionTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
