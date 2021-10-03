// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

/**
 * Protobuf type {@code binary.AppStateSyncKey}
 */
public final class AppStateSyncKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.AppStateSyncKey)
    AppStateSyncKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AppStateSyncKey.newBuilder() to construct.
  private AppStateSyncKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AppStateSyncKey() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AppStateSyncKey();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AppStateSyncKey(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = keyId_.toBuilder();
            }
            keyId_ = input.readMessage(br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(keyId_);
              keyId_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) != 0)) {
              subBuilder = keyData_.toBuilder();
            }
            keyData_ = input.readMessage(br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(keyData_);
              keyData_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey.class, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey.Builder.class);
  }

  private int bitField0_;
  public static final int KEYID_FIELD_NUMBER = 1;
  private br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId keyId_;
  /**
   * <code>optional .binary.AppStateSyncKeyId keyId = 1;</code>
   * @return Whether the keyId field is set.
   */
  @java.lang.Override
  public boolean hasKeyId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .binary.AppStateSyncKeyId keyId = 1;</code>
   * @return The keyId.
   */
  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId getKeyId() {
    return keyId_ == null ? br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.getDefaultInstance() : keyId_;
  }
  /**
   * <code>optional .binary.AppStateSyncKeyId keyId = 1;</code>
   */
  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyIdOrBuilder getKeyIdOrBuilder() {
    return keyId_ == null ? br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.getDefaultInstance() : keyId_;
  }

  public static final int KEYDATA_FIELD_NUMBER = 2;
  private br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData keyData_;
  /**
   * <code>optional .binary.AppStateSyncKeyData keyData = 2;</code>
   * @return Whether the keyData field is set.
   */
  @java.lang.Override
  public boolean hasKeyData() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .binary.AppStateSyncKeyData keyData = 2;</code>
   * @return The keyData.
   */
  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData getKeyData() {
    return keyData_ == null ? br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData.getDefaultInstance() : keyData_;
  }
  /**
   * <code>optional .binary.AppStateSyncKeyData keyData = 2;</code>
   */
  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyDataOrBuilder getKeyDataOrBuilder() {
    return keyData_ == null ? br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData.getDefaultInstance() : keyData_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getKeyId());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getKeyData());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getKeyId());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getKeyData());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey)) {
      return super.equals(obj);
    }
    br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey other = (br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey) obj;

    if (hasKeyId() != other.hasKeyId()) return false;
    if (hasKeyId()) {
      if (!getKeyId()
          .equals(other.getKeyId())) return false;
    }
    if (hasKeyData() != other.hasKeyData()) return false;
    if (hasKeyData()) {
      if (!getKeyData()
          .equals(other.getKeyData())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasKeyId()) {
      hash = (37 * hash) + KEYID_FIELD_NUMBER;
      hash = (53 * hash) + getKeyId().hashCode();
    }
    if (hasKeyData()) {
      hash = (37 * hash) + KEYDATA_FIELD_NUMBER;
      hash = (53 * hash) + getKeyData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code binary.AppStateSyncKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.AppStateSyncKey)
      br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey.class, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey.Builder.class);
    }

    // Construct using br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getKeyIdFieldBuilder();
        getKeyDataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (keyIdBuilder_ == null) {
        keyId_ = null;
      } else {
        keyIdBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (keyDataBuilder_ == null) {
        keyData_ = null;
      } else {
        keyDataBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKey_descriptor;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey getDefaultInstanceForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey build() {
      br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey buildPartial() {
      br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey result = new br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (keyIdBuilder_ == null) {
          result.keyId_ = keyId_;
        } else {
          result.keyId_ = keyIdBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (keyDataBuilder_ == null) {
          result.keyData_ = keyData_;
        } else {
          result.keyData_ = keyDataBuilder_.build();
        }
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey) {
        return mergeFrom((br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey other) {
      if (other == br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey.getDefaultInstance()) return this;
      if (other.hasKeyId()) {
        mergeKeyId(other.getKeyId());
      }
      if (other.hasKeyData()) {
        mergeKeyData(other.getKeyData());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId keyId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.Builder, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyIdOrBuilder> keyIdBuilder_;
    /**
     * <code>optional .binary.AppStateSyncKeyId keyId = 1;</code>
     * @return Whether the keyId field is set.
     */
    public boolean hasKeyId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .binary.AppStateSyncKeyId keyId = 1;</code>
     * @return The keyId.
     */
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId getKeyId() {
      if (keyIdBuilder_ == null) {
        return keyId_ == null ? br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.getDefaultInstance() : keyId_;
      } else {
        return keyIdBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .binary.AppStateSyncKeyId keyId = 1;</code>
     */
    public Builder setKeyId(br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId value) {
      if (keyIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        keyId_ = value;
        onChanged();
      } else {
        keyIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .binary.AppStateSyncKeyId keyId = 1;</code>
     */
    public Builder setKeyId(
        br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.Builder builderForValue) {
      if (keyIdBuilder_ == null) {
        keyId_ = builderForValue.build();
        onChanged();
      } else {
        keyIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .binary.AppStateSyncKeyId keyId = 1;</code>
     */
    public Builder mergeKeyId(br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId value) {
      if (keyIdBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            keyId_ != null &&
            keyId_ != br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.getDefaultInstance()) {
          keyId_ =
            br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.newBuilder(keyId_).mergeFrom(value).buildPartial();
        } else {
          keyId_ = value;
        }
        onChanged();
      } else {
        keyIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .binary.AppStateSyncKeyId keyId = 1;</code>
     */
    public Builder clearKeyId() {
      if (keyIdBuilder_ == null) {
        keyId_ = null;
        onChanged();
      } else {
        keyIdBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .binary.AppStateSyncKeyId keyId = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.Builder getKeyIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getKeyIdFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .binary.AppStateSyncKeyId keyId = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyIdOrBuilder getKeyIdOrBuilder() {
      if (keyIdBuilder_ != null) {
        return keyIdBuilder_.getMessageOrBuilder();
      } else {
        return keyId_ == null ?
            br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.getDefaultInstance() : keyId_;
      }
    }
    /**
     * <code>optional .binary.AppStateSyncKeyId keyId = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.Builder, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyIdOrBuilder> 
        getKeyIdFieldBuilder() {
      if (keyIdBuilder_ == null) {
        keyIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.Builder, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyIdOrBuilder>(
                getKeyId(),
                getParentForChildren(),
                isClean());
        keyId_ = null;
      }
      return keyIdBuilder_;
    }

    private br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData keyData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData.Builder, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyDataOrBuilder> keyDataBuilder_;
    /**
     * <code>optional .binary.AppStateSyncKeyData keyData = 2;</code>
     * @return Whether the keyData field is set.
     */
    public boolean hasKeyData() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .binary.AppStateSyncKeyData keyData = 2;</code>
     * @return The keyData.
     */
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData getKeyData() {
      if (keyDataBuilder_ == null) {
        return keyData_ == null ? br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData.getDefaultInstance() : keyData_;
      } else {
        return keyDataBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .binary.AppStateSyncKeyData keyData = 2;</code>
     */
    public Builder setKeyData(br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData value) {
      if (keyDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        keyData_ = value;
        onChanged();
      } else {
        keyDataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .binary.AppStateSyncKeyData keyData = 2;</code>
     */
    public Builder setKeyData(
        br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData.Builder builderForValue) {
      if (keyDataBuilder_ == null) {
        keyData_ = builderForValue.build();
        onChanged();
      } else {
        keyDataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .binary.AppStateSyncKeyData keyData = 2;</code>
     */
    public Builder mergeKeyData(br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData value) {
      if (keyDataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            keyData_ != null &&
            keyData_ != br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData.getDefaultInstance()) {
          keyData_ =
            br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData.newBuilder(keyData_).mergeFrom(value).buildPartial();
        } else {
          keyData_ = value;
        }
        onChanged();
      } else {
        keyDataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .binary.AppStateSyncKeyData keyData = 2;</code>
     */
    public Builder clearKeyData() {
      if (keyDataBuilder_ == null) {
        keyData_ = null;
        onChanged();
      } else {
        keyDataBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .binary.AppStateSyncKeyData keyData = 2;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData.Builder getKeyDataBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getKeyDataFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .binary.AppStateSyncKeyData keyData = 2;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyDataOrBuilder getKeyDataOrBuilder() {
      if (keyDataBuilder_ != null) {
        return keyDataBuilder_.getMessageOrBuilder();
      } else {
        return keyData_ == null ?
            br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData.getDefaultInstance() : keyData_;
      }
    }
    /**
     * <code>optional .binary.AppStateSyncKeyData keyData = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData.Builder, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyDataOrBuilder> 
        getKeyDataFieldBuilder() {
      if (keyDataBuilder_ == null) {
        keyDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData.Builder, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyDataOrBuilder>(
                getKeyData(),
                getParentForChildren(),
                isClean());
        keyData_ = null;
      }
      return keyDataBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:binary.AppStateSyncKey)
  }

  // @@protoc_insertion_point(class_scope:binary.AppStateSyncKey)
  private static final br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey();
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AppStateSyncKey>
      PARSER = new com.google.protobuf.AbstractParser<AppStateSyncKey>() {
    @java.lang.Override
    public AppStateSyncKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AppStateSyncKey(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AppStateSyncKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AppStateSyncKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

