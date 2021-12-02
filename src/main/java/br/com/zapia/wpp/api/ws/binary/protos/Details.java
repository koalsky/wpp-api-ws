// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

/**
 * Protobuf type {@code binary.Details}
 */
public final class Details extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:binary.Details)
        DetailsOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Details.newBuilder() to construct.
  private Details(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Details() {
    issuer_ = "";
    subject_ = "";
    key_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
          UnusedPrivateParameter unused) {
    return new Details();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  private Details(
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
          case 8: {
            bitField0_ |= 0x00000001;
            serial_ = input.readUInt32();
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            issuer_ = bs;
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            expires_ = input.readUInt64();
            break;
          }
          case 34: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000008;
            subject_ = bs;
            break;
          }
          case 42: {
            bitField0_ |= 0x00000010;
            key_ = input.readBytes();
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
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_Details_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
  internalGetFieldAccessorTable() {
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_Details_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                    br.com.zapia.wpp.api.ws.binary.protos.Details.class, br.com.zapia.wpp.api.ws.binary.protos.Details.Builder.class);
  }

  private int bitField0_;
  public static final int SERIAL_FIELD_NUMBER = 1;
  private int serial_;

  /**
   * <code>optional uint32 serial = 1;</code>
   *
   * @return Whether the serial field is set.
   */
  @java.lang.Override
  public boolean hasSerial() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   * <code>optional uint32 serial = 1;</code>
   *
   * @return The serial.
   */
  @java.lang.Override
  public int getSerial() {
    return serial_;
  }

  public static final int ISSUER_FIELD_NUMBER = 2;
  private volatile java.lang.Object issuer_;

  /**
   * <code>optional string issuer = 2;</code>
   *
   * @return Whether the issuer field is set.
   */
  @java.lang.Override
  public boolean hasIssuer() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   * <code>optional string issuer = 2;</code>
   *
   * @return The issuer.
   */
  @java.lang.Override
  public java.lang.String getIssuer() {
    java.lang.Object ref = issuer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        issuer_ = s;
      }
      return s;
    }
  }

  /**
   * <code>optional string issuer = 2;</code>
   *
   * @return The bytes for issuer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
  getIssuerBytes() {
    java.lang.Object ref = issuer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
      issuer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPIRES_FIELD_NUMBER = 3;
  private long expires_;

  /**
   * <code>optional uint64 expires = 3;</code>
   *
   * @return Whether the expires field is set.
   */
  @java.lang.Override
  public boolean hasExpires() {
    return ((bitField0_ & 0x00000004) != 0);
  }

  /**
   * <code>optional uint64 expires = 3;</code>
   *
   * @return The expires.
   */
  @java.lang.Override
  public long getExpires() {
    return expires_;
  }

  public static final int SUBJECT_FIELD_NUMBER = 4;
  private volatile java.lang.Object subject_;

  /**
   * <code>optional string subject = 4;</code>
   *
   * @return Whether the subject field is set.
   */
  @java.lang.Override
  public boolean hasSubject() {
    return ((bitField0_ & 0x00000008) != 0);
  }

  /**
   * <code>optional string subject = 4;</code>
   *
   * @return The subject.
   */
  @java.lang.Override
  public java.lang.String getSubject() {
    java.lang.Object ref = subject_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        subject_ = s;
      }
      return s;
    }
  }

  /**
   * <code>optional string subject = 4;</code>
   *
   * @return The bytes for subject.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
  getSubjectBytes() {
    java.lang.Object ref = subject_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
      subject_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEY_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString key_;

  /**
   * <code>optional bytes key = 5;</code>
   *
   * @return Whether the key field is set.
   */
  @java.lang.Override
  public boolean hasKey() {
    return ((bitField0_ & 0x00000010) != 0);
  }

  /**
   * <code>optional bytes key = 5;</code>
   *
   * @return The key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKey() {
    return key_;
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
      output.writeUInt32(1, serial_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, issuer_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeUInt64(3, expires_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, subject_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeBytes(5, key_);
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
              .computeUInt32Size(1, serial_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, issuer_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
              .computeUInt64Size(3, expires_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, subject_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
              .computeBytesSize(5, key_);
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
    if (!(obj instanceof br.com.zapia.wpp.api.ws.binary.protos.Details)) {
      return super.equals(obj);
    }
    br.com.zapia.wpp.api.ws.binary.protos.Details other = (br.com.zapia.wpp.api.ws.binary.protos.Details) obj;

    if (hasSerial() != other.hasSerial()) return false;
    if (hasSerial()) {
      if (getSerial()
              != other.getSerial()) return false;
    }
    if (hasIssuer() != other.hasIssuer()) return false;
    if (hasIssuer()) {
      if (!getIssuer()
              .equals(other.getIssuer())) return false;
    }
    if (hasExpires() != other.hasExpires()) return false;
    if (hasExpires()) {
      if (getExpires()
              != other.getExpires()) return false;
    }
    if (hasSubject() != other.hasSubject()) return false;
    if (hasSubject()) {
      if (!getSubject()
              .equals(other.getSubject())) return false;
    }
    if (hasKey() != other.hasKey()) return false;
    if (hasKey()) {
      if (!getKey()
              .equals(other.getKey())) return false;
    }
    return unknownFields.equals(other.unknownFields);
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasSerial()) {
      hash = (37 * hash) + SERIAL_FIELD_NUMBER;
      hash = (53 * hash) + getSerial();
    }
    if (hasIssuer()) {
      hash = (37 * hash) + ISSUER_FIELD_NUMBER;
      hash = (53 * hash) + getIssuer().hashCode();
    }
    if (hasExpires()) {
      hash = (37 * hash) + EXPIRES_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
              getExpires());
    }
    if (hasSubject()) {
      hash = (37 * hash) + SUBJECT_FIELD_NUMBER;
      hash = (53 * hash) + getSubject().hashCode();
    }
    if (hasKey()) {
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.Details parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.Details parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.Details parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.Details parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.Details parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.Details parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.Details parseFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.Details parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.Details parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.Details parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.Details parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.Details parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(br.com.zapia.wpp.api.ws.binary.protos.Details prototype) {
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
   * Protobuf type {@code binary.Details}
   */
  public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:binary.Details)
          br.com.zapia.wpp.api.ws.binary.protos.DetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_Details_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_Details_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      br.com.zapia.wpp.api.ws.binary.protos.Details.class, br.com.zapia.wpp.api.ws.binary.protos.Details.Builder.class);
    }

    // Construct using br.com.zapia.wpp.api.ws.binary.protos.Details.newBuilder()
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
      serial_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      issuer_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      expires_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      subject_ = "";
      bitField0_ = (bitField0_ & ~0x00000008);
      key_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_Details_descriptor;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.Details getDefaultInstanceForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.Details.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.Details build() {
      br.com.zapia.wpp.api.ws.binary.protos.Details result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.Details buildPartial() {
      br.com.zapia.wpp.api.ws.binary.protos.Details result = new br.com.zapia.wpp.api.ws.binary.protos.Details(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.serial_ = serial_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.issuer_ = issuer_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.expires_ = expires_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        to_bitField0_ |= 0x00000008;
      }
      result.subject_ = subject_;
      if (((from_bitField0_ & 0x00000010) != 0)) {
        to_bitField0_ |= 0x00000010;
      }
      result.key_ = key_;
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
      if (other instanceof br.com.zapia.wpp.api.ws.binary.protos.Details) {
        return mergeFrom((br.com.zapia.wpp.api.ws.binary.protos.Details) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.zapia.wpp.api.ws.binary.protos.Details other) {
      if (other == br.com.zapia.wpp.api.ws.binary.protos.Details.getDefaultInstance()) return this;
      if (other.hasSerial()) {
        setSerial(other.getSerial());
      }
      if (other.hasIssuer()) {
        bitField0_ |= 0x00000002;
        issuer_ = other.issuer_;
        onChanged();
      }
      if (other.hasExpires()) {
        setExpires(other.getExpires());
      }
      if (other.hasSubject()) {
        bitField0_ |= 0x00000008;
        subject_ = other.subject_;
        onChanged();
      }
      if (other.hasKey()) {
        setKey(other.getKey());
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
      br.com.zapia.wpp.api.ws.binary.protos.Details parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.zapia.wpp.api.ws.binary.protos.Details) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private int serial_;

    /**
     * <code>optional uint32 serial = 1;</code>
     *
     * @return Whether the serial field is set.
     */
    @java.lang.Override
    public boolean hasSerial() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>optional uint32 serial = 1;</code>
     *
     * @return The serial.
     */
    @java.lang.Override
    public int getSerial() {
      return serial_;
    }

    /**
     * <code>optional uint32 serial = 1;</code>
     *
     * @param value The serial to set.
     * @return This builder for chaining.
     */
    public Builder setSerial(int value) {
      bitField0_ |= 0x00000001;
      serial_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>optional uint32 serial = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSerial() {
      bitField0_ = (bitField0_ & ~0x00000001);
      serial_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object issuer_ = "";

    /**
     * <code>optional string issuer = 2;</code>
     *
     * @return Whether the issuer field is set.
     */
    public boolean hasIssuer() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>optional string issuer = 2;</code>
     *
     * @return The issuer.
     */
    public java.lang.String getIssuer() {
      java.lang.Object ref = issuer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          issuer_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <code>optional string issuer = 2;</code>
     *
     * @return The bytes for issuer.
     */
    public com.google.protobuf.ByteString
    getIssuerBytes() {
      java.lang.Object ref = issuer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        issuer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <code>optional string issuer = 2;</code>
     *
     * @param value The issuer to set.
     * @return This builder for chaining.
     */
    public Builder setIssuer(
            java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      issuer_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>optional string issuer = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIssuer() {
      bitField0_ = (bitField0_ & ~0x00000002);
      issuer_ = getDefaultInstance().getIssuer();
      onChanged();
      return this;
    }

    /**
     * <code>optional string issuer = 2;</code>
     *
     * @param value The bytes for issuer to set.
     * @return This builder for chaining.
     */
    public Builder setIssuerBytes(
            com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      issuer_ = value;
      onChanged();
      return this;
    }

    private long expires_;

    /**
     * <code>optional uint64 expires = 3;</code>
     *
     * @return Whether the expires field is set.
     */
    @java.lang.Override
    public boolean hasExpires() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     * <code>optional uint64 expires = 3;</code>
     *
     * @return The expires.
     */
    @java.lang.Override
    public long getExpires() {
      return expires_;
    }

    /**
     * <code>optional uint64 expires = 3;</code>
     *
     * @param value The expires to set.
     * @return This builder for chaining.
     */
    public Builder setExpires(long value) {
      bitField0_ |= 0x00000004;
      expires_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>optional uint64 expires = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExpires() {
      bitField0_ = (bitField0_ & ~0x00000004);
      expires_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object subject_ = "";

    /**
     * <code>optional string subject = 4;</code>
     *
     * @return Whether the subject field is set.
     */
    public boolean hasSubject() {
      return ((bitField0_ & 0x00000008) != 0);
    }

    /**
     * <code>optional string subject = 4;</code>
     *
     * @return The subject.
     */
    public java.lang.String getSubject() {
      java.lang.Object ref = subject_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          subject_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <code>optional string subject = 4;</code>
     *
     * @return The bytes for subject.
     */
    public com.google.protobuf.ByteString
    getSubjectBytes() {
      java.lang.Object ref = subject_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        subject_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <code>optional string subject = 4;</code>
     *
     * @param value The subject to set.
     * @return This builder for chaining.
     */
    public Builder setSubject(
            java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      subject_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>optional string subject = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSubject() {
      bitField0_ = (bitField0_ & ~0x00000008);
      subject_ = getDefaultInstance().getSubject();
      onChanged();
      return this;
    }

    /**
     * <code>optional string subject = 4;</code>
     *
     * @param value The bytes for subject to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectBytes(
            com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      subject_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;

    /**
     * <code>optional bytes key = 5;</code>
     *
     * @return Whether the key field is set.
     */
    @java.lang.Override
    public boolean hasKey() {
      return ((bitField0_ & 0x00000010) != 0);
    }

    /**
     * <code>optional bytes key = 5;</code>
     *
     * @return The key.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }

    /**
     * <code>optional bytes key = 5;</code>
     *
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000010;
      key_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>optional bytes key = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      bitField0_ = (bitField0_ & ~0x00000010);
      key_ = getDefaultInstance().getKey();
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


    // @@protoc_insertion_point(builder_scope:binary.Details)
  }

  // @@protoc_insertion_point(class_scope:binary.Details)
  private static final br.com.zapia.wpp.api.ws.binary.protos.Details DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new br.com.zapia.wpp.api.ws.binary.protos.Details();
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.Details getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated
  public static final com.google.protobuf.Parser<Details>
          PARSER = new com.google.protobuf.AbstractParser<Details>() {
    @java.lang.Override
    public Details parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return new Details(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Details> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Details> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.Details getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

