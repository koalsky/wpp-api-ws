// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

/**
 * Protobuf type {@code binary.SyncdMutations}
 */
public final class SyncdMutations extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.SyncdMutations)
    SyncdMutationsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SyncdMutations.newBuilder() to construct.
  private SyncdMutations(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SyncdMutations() {
    mutations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SyncdMutations();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SyncdMutations(
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
              mutations_ = new java.util.ArrayList<br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation>();
              mutable_bitField0_ |= 0x00000001;
            }
            mutations_.add(
                input.readMessage(br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation.PARSER, extensionRegistry));
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
        mutations_ = java.util.Collections.unmodifiableList(mutations_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_SyncdMutations_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_SyncdMutations_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations.class, br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations.Builder.class);
  }

  public static final int MUTATIONS_FIELD_NUMBER = 1;
  private java.util.List<br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation> mutations_;
  /**
   * <code>repeated .binary.SyncdMutation mutations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation> getMutationsList() {
    return mutations_;
  }
  /**
   * <code>repeated .binary.SyncdMutation mutations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends br.com.zapia.wpp.api.ws.binary.protos.SyncdMutationOrBuilder> 
      getMutationsOrBuilderList() {
    return mutations_;
  }
  /**
   * <code>repeated .binary.SyncdMutation mutations = 1;</code>
   */
  @java.lang.Override
  public int getMutationsCount() {
    return mutations_.size();
  }
  /**
   * <code>repeated .binary.SyncdMutation mutations = 1;</code>
   */
  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation getMutations(int index) {
    return mutations_.get(index);
  }
  /**
   * <code>repeated .binary.SyncdMutation mutations = 1;</code>
   */
  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.SyncdMutationOrBuilder getMutationsOrBuilder(
      int index) {
    return mutations_.get(index);
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
    for (int i = 0; i < mutations_.size(); i++) {
      output.writeMessage(1, mutations_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < mutations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, mutations_.get(i));
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
    if (!(obj instanceof br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations)) {
      return super.equals(obj);
    }
    br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations other = (br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations) obj;

    if (!getMutationsList()
        .equals(other.getMutationsList())) return false;
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
    if (getMutationsCount() > 0) {
      hash = (37 * hash) + MUTATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getMutationsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations parseFrom(
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
  public static Builder newBuilder(br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations prototype) {
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
   * Protobuf type {@code binary.SyncdMutations}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.SyncdMutations)
      br.com.zapia.wpp.api.ws.binary.protos.SyncdMutationsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_SyncdMutations_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_SyncdMutations_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations.class, br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations.Builder.class);
    }

    // Construct using br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations.newBuilder()
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
        getMutationsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (mutationsBuilder_ == null) {
        mutations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        mutationsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_SyncdMutations_descriptor;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations getDefaultInstanceForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations build() {
      br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations buildPartial() {
      br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations result = new br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations(this);
      int from_bitField0_ = bitField0_;
      if (mutationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          mutations_ = java.util.Collections.unmodifiableList(mutations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mutations_ = mutations_;
      } else {
        result.mutations_ = mutationsBuilder_.build();
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
      if (other instanceof br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations) {
        return mergeFrom((br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations other) {
      if (other == br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations.getDefaultInstance()) return this;
      if (mutationsBuilder_ == null) {
        if (!other.mutations_.isEmpty()) {
          if (mutations_.isEmpty()) {
            mutations_ = other.mutations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMutationsIsMutable();
            mutations_.addAll(other.mutations_);
          }
          onChanged();
        }
      } else {
        if (!other.mutations_.isEmpty()) {
          if (mutationsBuilder_.isEmpty()) {
            mutationsBuilder_.dispose();
            mutationsBuilder_ = null;
            mutations_ = other.mutations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            mutationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMutationsFieldBuilder() : null;
          } else {
            mutationsBuilder_.addAllMessages(other.mutations_);
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
      br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation> mutations_ =
      java.util.Collections.emptyList();
    private void ensureMutationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mutations_ = new java.util.ArrayList<br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation>(mutations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation, br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation.Builder, br.com.zapia.wpp.api.ws.binary.protos.SyncdMutationOrBuilder> mutationsBuilder_;

    /**
     * <code>repeated .binary.SyncdMutation mutations = 1;</code>
     */
    public java.util.List<br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation> getMutationsList() {
      if (mutationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mutations_);
      } else {
        return mutationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .binary.SyncdMutation mutations = 1;</code>
     */
    public int getMutationsCount() {
      if (mutationsBuilder_ == null) {
        return mutations_.size();
      } else {
        return mutationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .binary.SyncdMutation mutations = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation getMutations(int index) {
      if (mutationsBuilder_ == null) {
        return mutations_.get(index);
      } else {
        return mutationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .binary.SyncdMutation mutations = 1;</code>
     */
    public Builder setMutations(
        int index, br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation value) {
      if (mutationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMutationsIsMutable();
        mutations_.set(index, value);
        onChanged();
      } else {
        mutationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .binary.SyncdMutation mutations = 1;</code>
     */
    public Builder setMutations(
        int index, br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation.Builder builderForValue) {
      if (mutationsBuilder_ == null) {
        ensureMutationsIsMutable();
        mutations_.set(index, builderForValue.build());
        onChanged();
      } else {
        mutationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .binary.SyncdMutation mutations = 1;</code>
     */
    public Builder addMutations(br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation value) {
      if (mutationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMutationsIsMutable();
        mutations_.add(value);
        onChanged();
      } else {
        mutationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .binary.SyncdMutation mutations = 1;</code>
     */
    public Builder addMutations(
        int index, br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation value) {
      if (mutationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMutationsIsMutable();
        mutations_.add(index, value);
        onChanged();
      } else {
        mutationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .binary.SyncdMutation mutations = 1;</code>
     */
    public Builder addMutations(
        br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation.Builder builderForValue) {
      if (mutationsBuilder_ == null) {
        ensureMutationsIsMutable();
        mutations_.add(builderForValue.build());
        onChanged();
      } else {
        mutationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .binary.SyncdMutation mutations = 1;</code>
     */
    public Builder addMutations(
        int index, br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation.Builder builderForValue) {
      if (mutationsBuilder_ == null) {
        ensureMutationsIsMutable();
        mutations_.add(index, builderForValue.build());
        onChanged();
      } else {
        mutationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .binary.SyncdMutation mutations = 1;</code>
     */
    public Builder addAllMutations(
        java.lang.Iterable<? extends br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation> values) {
      if (mutationsBuilder_ == null) {
        ensureMutationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mutations_);
        onChanged();
      } else {
        mutationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .binary.SyncdMutation mutations = 1;</code>
     */
    public Builder clearMutations() {
      if (mutationsBuilder_ == null) {
        mutations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        mutationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .binary.SyncdMutation mutations = 1;</code>
     */
    public Builder removeMutations(int index) {
      if (mutationsBuilder_ == null) {
        ensureMutationsIsMutable();
        mutations_.remove(index);
        onChanged();
      } else {
        mutationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .binary.SyncdMutation mutations = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation.Builder getMutationsBuilder(
        int index) {
      return getMutationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .binary.SyncdMutation mutations = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.SyncdMutationOrBuilder getMutationsOrBuilder(
        int index) {
      if (mutationsBuilder_ == null) {
        return mutations_.get(index);  } else {
        return mutationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .binary.SyncdMutation mutations = 1;</code>
     */
    public java.util.List<? extends br.com.zapia.wpp.api.ws.binary.protos.SyncdMutationOrBuilder> 
         getMutationsOrBuilderList() {
      if (mutationsBuilder_ != null) {
        return mutationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mutations_);
      }
    }
    /**
     * <code>repeated .binary.SyncdMutation mutations = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation.Builder addMutationsBuilder() {
      return getMutationsFieldBuilder().addBuilder(
          br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation.getDefaultInstance());
    }
    /**
     * <code>repeated .binary.SyncdMutation mutations = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation.Builder addMutationsBuilder(
        int index) {
      return getMutationsFieldBuilder().addBuilder(
          index, br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation.getDefaultInstance());
    }
    /**
     * <code>repeated .binary.SyncdMutation mutations = 1;</code>
     */
    public java.util.List<br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation.Builder> 
         getMutationsBuilderList() {
      return getMutationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation, br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation.Builder, br.com.zapia.wpp.api.ws.binary.protos.SyncdMutationOrBuilder> 
        getMutationsFieldBuilder() {
      if (mutationsBuilder_ == null) {
        mutationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation, br.com.zapia.wpp.api.ws.binary.protos.SyncdMutation.Builder, br.com.zapia.wpp.api.ws.binary.protos.SyncdMutationOrBuilder>(
                mutations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        mutations_ = null;
      }
      return mutationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:binary.SyncdMutations)
  }

  // @@protoc_insertion_point(class_scope:binary.SyncdMutations)
  private static final br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations();
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<SyncdMutations>
      PARSER = new com.google.protobuf.AbstractParser<SyncdMutations>() {
    @java.lang.Override
    public SyncdMutations parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SyncdMutations(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SyncdMutations> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SyncdMutations> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.SyncdMutations getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

