// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

/**
 * Protobuf type {@code binary.AppStateSyncKeyShare}
 */
public final class AppStateSyncKeyShare extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.AppStateSyncKeyShare)
    AppStateSyncKeyShareOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AppStateSyncKeyShare.newBuilder() to construct.
  private AppStateSyncKeyShare(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AppStateSyncKeyShare() {
    keys_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AppStateSyncKeyShare();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AppStateSyncKeyShare(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              keys_ = new java.util.ArrayList<br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey>();
              mutable_bitField0_ |= 0x00000001;
            }
            keys_.add(
                input.readMessage(br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey.PARSER, extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        keys_ = java.util.Collections.unmodifiableList(keys_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKeyShare_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKeyShare_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare.class, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare.Builder.class);
  }

  public static final int KEYS_FIELD_NUMBER = 1;
  private java.util.List<br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey> keys_;
  /**
   * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
   */
  @java.lang.Override
  public java.util.List<br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey> getKeysList() {
    return keys_;
  }
  /**
   * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyOrBuilder> 
      getKeysOrBuilderList() {
    return keys_;
  }
  /**
   * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
   */
  @java.lang.Override
  public int getKeysCount() {
    return keys_.size();
  }
  /**
   * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
   */
  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey getKeys(int index) {
    return keys_.get(index);
  }
  /**
   * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
   */
  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyOrBuilder getKeysOrBuilder(
      int index) {
    return keys_.get(index);
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
    for (int i = 0; i < keys_.size(); i++) {
      output.writeMessage(1, keys_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < keys_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, keys_.get(i));
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
    if (!(obj instanceof br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare)) {
      return super.equals(obj);
    }
    br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare other = (br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare) obj;

    if (!getKeysList()
        .equals(other.getKeysList())) return false;
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
    if (getKeysCount() > 0) {
      hash = (37 * hash) + KEYS_FIELD_NUMBER;
      hash = (53 * hash) + getKeysList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare parseFrom(
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
  public static Builder newBuilder(br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare prototype) {
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
   * Protobuf type {@code binary.AppStateSyncKeyShare}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.AppStateSyncKeyShare)
      br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShareOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKeyShare_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKeyShare_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare.class, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare.Builder.class);
    }

    // Construct using br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare.newBuilder()
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
        getKeysFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (keysBuilder_ == null) {
        keys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        keysBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKeyShare_descriptor;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare getDefaultInstanceForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare build() {
      br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare buildPartial() {
      br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare result = new br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare(this);
      int from_bitField0_ = bitField0_;
      if (keysBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          keys_ = java.util.Collections.unmodifiableList(keys_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.keys_ = keys_;
      } else {
        result.keys_ = keysBuilder_.build();
      }
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
      if (other instanceof br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare) {
        return mergeFrom((br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare other) {
      if (other == br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare.getDefaultInstance()) return this;
      if (keysBuilder_ == null) {
        if (!other.keys_.isEmpty()) {
          if (keys_.isEmpty()) {
            keys_ = other.keys_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureKeysIsMutable();
            keys_.addAll(other.keys_);
          }
          onChanged();
        }
      } else {
        if (!other.keys_.isEmpty()) {
          if (keysBuilder_.isEmpty()) {
            keysBuilder_.dispose();
            keysBuilder_ = null;
            keys_ = other.keys_;
            bitField0_ = (bitField0_ & ~0x00000001);
            keysBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getKeysFieldBuilder() : null;
          } else {
            keysBuilder_.addAllMessages(other.keys_);
          }
        }
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
      br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey> keys_ =
      java.util.Collections.emptyList();
    private void ensureKeysIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        keys_ = new java.util.ArrayList<br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey>(keys_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey.Builder, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyOrBuilder> keysBuilder_;

    /**
     * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
     */
    public java.util.List<br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey> getKeysList() {
      if (keysBuilder_ == null) {
        return java.util.Collections.unmodifiableList(keys_);
      } else {
        return keysBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
     */
    public int getKeysCount() {
      if (keysBuilder_ == null) {
        return keys_.size();
      } else {
        return keysBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey getKeys(int index) {
      if (keysBuilder_ == null) {
        return keys_.get(index);
      } else {
        return keysBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
     */
    public Builder setKeys(
        int index, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey value) {
      if (keysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeysIsMutable();
        keys_.set(index, value);
        onChanged();
      } else {
        keysBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
     */
    public Builder setKeys(
        int index, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey.Builder builderForValue) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.set(index, builderForValue.build());
        onChanged();
      } else {
        keysBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
     */
    public Builder addKeys(br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey value) {
      if (keysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeysIsMutable();
        keys_.add(value);
        onChanged();
      } else {
        keysBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
     */
    public Builder addKeys(
        int index, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey value) {
      if (keysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeysIsMutable();
        keys_.add(index, value);
        onChanged();
      } else {
        keysBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
     */
    public Builder addKeys(
        br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey.Builder builderForValue) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.add(builderForValue.build());
        onChanged();
      } else {
        keysBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
     */
    public Builder addKeys(
        int index, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey.Builder builderForValue) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.add(index, builderForValue.build());
        onChanged();
      } else {
        keysBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
     */
    public Builder addAllKeys(
        java.lang.Iterable<? extends br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey> values) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, keys_);
        onChanged();
      } else {
        keysBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
     */
    public Builder clearKeys() {
      if (keysBuilder_ == null) {
        keys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        keysBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
     */
    public Builder removeKeys(int index) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.remove(index);
        onChanged();
      } else {
        keysBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey.Builder getKeysBuilder(
        int index) {
      return getKeysFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyOrBuilder getKeysOrBuilder(
        int index) {
      if (keysBuilder_ == null) {
        return keys_.get(index);  } else {
        return keysBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
     */
    public java.util.List<? extends br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyOrBuilder> 
         getKeysOrBuilderList() {
      if (keysBuilder_ != null) {
        return keysBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(keys_);
      }
    }
    /**
     * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey.Builder addKeysBuilder() {
      return getKeysFieldBuilder().addBuilder(
          br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey.getDefaultInstance());
    }
    /**
     * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey.Builder addKeysBuilder(
        int index) {
      return getKeysFieldBuilder().addBuilder(
          index, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey.getDefaultInstance());
    }
    /**
     * <code>repeated .binary.AppStateSyncKey keys = 1;</code>
     */
    public java.util.List<br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey.Builder> 
         getKeysBuilderList() {
      return getKeysFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey.Builder, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyOrBuilder> 
        getKeysFieldBuilder() {
      if (keysBuilder_ == null) {
        keysBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKey.Builder, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyOrBuilder>(
                keys_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        keys_ = null;
      }
      return keysBuilder_;
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


    // @@protoc_insertion_point(builder_scope:binary.AppStateSyncKeyShare)
  }

  // @@protoc_insertion_point(class_scope:binary.AppStateSyncKeyShare)
  private static final br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare();
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AppStateSyncKeyShare>
      PARSER = new com.google.protobuf.AbstractParser<AppStateSyncKeyShare>() {
    @java.lang.Override
    public AppStateSyncKeyShare parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AppStateSyncKeyShare(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AppStateSyncKeyShare> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AppStateSyncKeyShare> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyShare getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

