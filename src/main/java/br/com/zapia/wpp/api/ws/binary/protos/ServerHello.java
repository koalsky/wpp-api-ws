// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

/**
 * Protobuf type {@code binary.ServerHello}
 */
public final class ServerHello extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.ServerHello)
    ServerHelloOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServerHello.newBuilder() to construct.
  private ServerHello(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServerHello() {
    ephemeral_ = com.google.protobuf.ByteString.EMPTY;
    static_ = com.google.protobuf.ByteString.EMPTY;
    payload_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ServerHello();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ServerHello(
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
            bitField0_ |= 0x00000001;
            ephemeral_ = input.readBytes();
            break;
          }
          case 18: {
            bitField0_ |= 0x00000002;
            static_ = input.readBytes();
            break;
          }
          case 26: {
            bitField0_ |= 0x00000004;
            payload_ = input.readBytes();
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
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_ServerHello_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_ServerHello_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.zapia.wpp.api.ws.binary.protos.ServerHello.class, br.com.zapia.wpp.api.ws.binary.protos.ServerHello.Builder.class);
  }

  private int bitField0_;
  public static final int EPHEMERAL_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString ephemeral_;
  /**
   * <code>optional bytes ephemeral = 1;</code>
   * @return Whether the ephemeral field is set.
   */
  @java.lang.Override
  public boolean hasEphemeral() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional bytes ephemeral = 1;</code>
   * @return The ephemeral.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEphemeral() {
    return ephemeral_;
  }

  public static final int STATIC_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString static_;
  /**
   * <code>optional bytes static = 2;</code>
   * @return Whether the static field is set.
   */
  @java.lang.Override
  public boolean hasStatic() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional bytes static = 2;</code>
   * @return The static.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getStatic() {
    return static_;
  }

  public static final int PAYLOAD_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString payload_;
  /**
   * <code>optional bytes payload = 3;</code>
   * @return Whether the payload field is set.
   */
  @java.lang.Override
  public boolean hasPayload() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional bytes payload = 3;</code>
   * @return The payload.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPayload() {
    return payload_;
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
      output.writeBytes(1, ephemeral_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBytes(2, static_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeBytes(3, payload_);
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
        .computeBytesSize(1, ephemeral_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, static_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, payload_);
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
    if (!(obj instanceof br.com.zapia.wpp.api.ws.binary.protos.ServerHello)) {
      return super.equals(obj);
    }
    br.com.zapia.wpp.api.ws.binary.protos.ServerHello other = (br.com.zapia.wpp.api.ws.binary.protos.ServerHello) obj;

    if (hasEphemeral() != other.hasEphemeral()) return false;
    if (hasEphemeral()) {
      if (!getEphemeral()
          .equals(other.getEphemeral())) return false;
    }
    if (hasStatic() != other.hasStatic()) return false;
    if (hasStatic()) {
      if (!getStatic()
          .equals(other.getStatic())) return false;
    }
    if (hasPayload() != other.hasPayload()) return false;
    if (hasPayload()) {
      if (!getPayload()
          .equals(other.getPayload())) return false;
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
    if (hasEphemeral()) {
      hash = (37 * hash) + EPHEMERAL_FIELD_NUMBER;
      hash = (53 * hash) + getEphemeral().hashCode();
    }
    if (hasStatic()) {
      hash = (37 * hash) + STATIC_FIELD_NUMBER;
      hash = (53 * hash) + getStatic().hashCode();
    }
    if (hasPayload()) {
      hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getPayload().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.ServerHello parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.ServerHello parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.ServerHello parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.ServerHello parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.ServerHello parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.ServerHello parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.ServerHello parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.ServerHello parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.ServerHello parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.ServerHello parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.ServerHello parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.ServerHello parseFrom(
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
  public static Builder newBuilder(br.com.zapia.wpp.api.ws.binary.protos.ServerHello prototype) {
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
   * Protobuf type {@code binary.ServerHello}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.ServerHello)
      br.com.zapia.wpp.api.ws.binary.protos.ServerHelloOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_ServerHello_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_ServerHello_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.zapia.wpp.api.ws.binary.protos.ServerHello.class, br.com.zapia.wpp.api.ws.binary.protos.ServerHello.Builder.class);
    }

    // Construct using br.com.zapia.wpp.api.ws.binary.protos.ServerHello.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      ephemeral_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      static_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      payload_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_ServerHello_descriptor;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.ServerHello getDefaultInstanceForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.ServerHello.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.ServerHello build() {
      br.com.zapia.wpp.api.ws.binary.protos.ServerHello result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.ServerHello buildPartial() {
      br.com.zapia.wpp.api.ws.binary.protos.ServerHello result = new br.com.zapia.wpp.api.ws.binary.protos.ServerHello(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.ephemeral_ = ephemeral_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.static_ = static_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.payload_ = payload_;
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
      if (other instanceof br.com.zapia.wpp.api.ws.binary.protos.ServerHello) {
        return mergeFrom((br.com.zapia.wpp.api.ws.binary.protos.ServerHello)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.zapia.wpp.api.ws.binary.protos.ServerHello other) {
      if (other == br.com.zapia.wpp.api.ws.binary.protos.ServerHello.getDefaultInstance()) return this;
      if (other.hasEphemeral()) {
        setEphemeral(other.getEphemeral());
      }
      if (other.hasStatic()) {
        setStatic(other.getStatic());
      }
      if (other.hasPayload()) {
        setPayload(other.getPayload());
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
      br.com.zapia.wpp.api.ws.binary.protos.ServerHello parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.zapia.wpp.api.ws.binary.protos.ServerHello) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.ByteString ephemeral_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes ephemeral = 1;</code>
     * @return Whether the ephemeral field is set.
     */
    @java.lang.Override
    public boolean hasEphemeral() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bytes ephemeral = 1;</code>
     * @return The ephemeral.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getEphemeral() {
      return ephemeral_;
    }
    /**
     * <code>optional bytes ephemeral = 1;</code>
     * @param value The ephemeral to set.
     * @return This builder for chaining.
     */
    public Builder setEphemeral(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      ephemeral_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes ephemeral = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEphemeral() {
      bitField0_ = (bitField0_ & ~0x00000001);
      ephemeral_ = getDefaultInstance().getEphemeral();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString static_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes static = 2;</code>
     * @return Whether the static field is set.
     */
    @java.lang.Override
    public boolean hasStatic() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bytes static = 2;</code>
     * @return The static.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getStatic() {
      return static_;
    }
    /**
     * <code>optional bytes static = 2;</code>
     * @param value The static to set.
     * @return This builder for chaining.
     */
    public Builder setStatic(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      static_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes static = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatic() {
      bitField0_ = (bitField0_ & ~0x00000002);
      static_ = getDefaultInstance().getStatic();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes payload = 3;</code>
     * @return Whether the payload field is set.
     */
    @java.lang.Override
    public boolean hasPayload() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional bytes payload = 3;</code>
     * @return The payload.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }
    /**
     * <code>optional bytes payload = 3;</code>
     * @param value The payload to set.
     * @return This builder for chaining.
     */
    public Builder setPayload(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      payload_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes payload = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPayload() {
      bitField0_ = (bitField0_ & ~0x00000004);
      payload_ = getDefaultInstance().getPayload();
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:binary.ServerHello)
  }

  // @@protoc_insertion_point(class_scope:binary.ServerHello)
  private static final br.com.zapia.wpp.api.ws.binary.protos.ServerHello DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.zapia.wpp.api.ws.binary.protos.ServerHello();
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.ServerHello getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ServerHello>
      PARSER = new com.google.protobuf.AbstractParser<ServerHello>() {
    @java.lang.Override
    public ServerHello parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ServerHello(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ServerHello> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServerHello> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.ServerHello getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

