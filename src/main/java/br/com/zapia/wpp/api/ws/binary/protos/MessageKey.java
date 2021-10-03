// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

/**
 * Protobuf type {@code binary.MessageKey}
 */
public final class MessageKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.MessageKey)
    MessageKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MessageKey.newBuilder() to construct.
  private MessageKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MessageKey() {
    remoteJid_ = "";
    id_ = "";
    participant_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MessageKey();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MessageKey(
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
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000001;
            remoteJid_ = bs;
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            fromMe_ = input.readBool();
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000004;
            id_ = bs;
            break;
          }
          case 34: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000008;
            participant_ = bs;
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
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_MessageKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_MessageKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.zapia.wpp.api.ws.binary.protos.MessageKey.class, br.com.zapia.wpp.api.ws.binary.protos.MessageKey.Builder.class);
  }

  private int bitField0_;
  public static final int REMOTEJID_FIELD_NUMBER = 1;
  private volatile java.lang.Object remoteJid_;
  /**
   * <code>optional string remoteJid = 1;</code>
   * @return Whether the remoteJid field is set.
   */
  @java.lang.Override
  public boolean hasRemoteJid() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string remoteJid = 1;</code>
   * @return The remoteJid.
   */
  @java.lang.Override
  public java.lang.String getRemoteJid() {
    java.lang.Object ref = remoteJid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        remoteJid_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string remoteJid = 1;</code>
   * @return The bytes for remoteJid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRemoteJidBytes() {
    java.lang.Object ref = remoteJid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      remoteJid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FROMME_FIELD_NUMBER = 2;
  private boolean fromMe_;
  /**
   * <code>optional bool fromMe = 2;</code>
   * @return Whether the fromMe field is set.
   */
  @java.lang.Override
  public boolean hasFromMe() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional bool fromMe = 2;</code>
   * @return The fromMe.
   */
  @java.lang.Override
  public boolean getFromMe() {
    return fromMe_;
  }

  public static final int ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object id_;
  /**
   * <code>optional string id = 3;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional string id = 3;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        id_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string id = 3;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARTICIPANT_FIELD_NUMBER = 4;
  private volatile java.lang.Object participant_;
  /**
   * <code>optional string participant = 4;</code>
   * @return Whether the participant field is set.
   */
  @java.lang.Override
  public boolean hasParticipant() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional string participant = 4;</code>
   * @return The participant.
   */
  @java.lang.Override
  public java.lang.String getParticipant() {
    java.lang.Object ref = participant_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        participant_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string participant = 4;</code>
   * @return The bytes for participant.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParticipantBytes() {
    java.lang.Object ref = participant_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      participant_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, remoteJid_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(2, fromMe_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, id_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, participant_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, remoteJid_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, fromMe_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, id_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, participant_);
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
    if (!(obj instanceof br.com.zapia.wpp.api.ws.binary.protos.MessageKey)) {
      return super.equals(obj);
    }
    br.com.zapia.wpp.api.ws.binary.protos.MessageKey other = (br.com.zapia.wpp.api.ws.binary.protos.MessageKey) obj;

    if (hasRemoteJid() != other.hasRemoteJid()) return false;
    if (hasRemoteJid()) {
      if (!getRemoteJid()
          .equals(other.getRemoteJid())) return false;
    }
    if (hasFromMe() != other.hasFromMe()) return false;
    if (hasFromMe()) {
      if (getFromMe()
          != other.getFromMe()) return false;
    }
    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (hasParticipant() != other.hasParticipant()) return false;
    if (hasParticipant()) {
      if (!getParticipant()
          .equals(other.getParticipant())) return false;
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
    if (hasRemoteJid()) {
      hash = (37 * hash) + REMOTEJID_FIELD_NUMBER;
      hash = (53 * hash) + getRemoteJid().hashCode();
    }
    if (hasFromMe()) {
      hash = (37 * hash) + FROMME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getFromMe());
    }
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
    }
    if (hasParticipant()) {
      hash = (37 * hash) + PARTICIPANT_FIELD_NUMBER;
      hash = (53 * hash) + getParticipant().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.MessageKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.MessageKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.MessageKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.MessageKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.MessageKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.MessageKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.MessageKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.MessageKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.MessageKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.MessageKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.MessageKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.MessageKey parseFrom(
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
  public static Builder newBuilder(br.com.zapia.wpp.api.ws.binary.protos.MessageKey prototype) {
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
   * Protobuf type {@code binary.MessageKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.MessageKey)
      br.com.zapia.wpp.api.ws.binary.protos.MessageKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_MessageKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_MessageKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.zapia.wpp.api.ws.binary.protos.MessageKey.class, br.com.zapia.wpp.api.ws.binary.protos.MessageKey.Builder.class);
    }

    // Construct using br.com.zapia.wpp.api.ws.binary.protos.MessageKey.newBuilder()
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
      remoteJid_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      fromMe_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      id_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      participant_ = "";
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_MessageKey_descriptor;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.MessageKey getDefaultInstanceForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.MessageKey.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.MessageKey build() {
      br.com.zapia.wpp.api.ws.binary.protos.MessageKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.MessageKey buildPartial() {
      br.com.zapia.wpp.api.ws.binary.protos.MessageKey result = new br.com.zapia.wpp.api.ws.binary.protos.MessageKey(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.remoteJid_ = remoteJid_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fromMe_ = fromMe_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.id_ = id_;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        to_bitField0_ |= 0x00000008;
      }
      result.participant_ = participant_;
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
      if (other instanceof br.com.zapia.wpp.api.ws.binary.protos.MessageKey) {
        return mergeFrom((br.com.zapia.wpp.api.ws.binary.protos.MessageKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.zapia.wpp.api.ws.binary.protos.MessageKey other) {
      if (other == br.com.zapia.wpp.api.ws.binary.protos.MessageKey.getDefaultInstance()) return this;
      if (other.hasRemoteJid()) {
        bitField0_ |= 0x00000001;
        remoteJid_ = other.remoteJid_;
        onChanged();
      }
      if (other.hasFromMe()) {
        setFromMe(other.getFromMe());
      }
      if (other.hasId()) {
        bitField0_ |= 0x00000004;
        id_ = other.id_;
        onChanged();
      }
      if (other.hasParticipant()) {
        bitField0_ |= 0x00000008;
        participant_ = other.participant_;
        onChanged();
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
      br.com.zapia.wpp.api.ws.binary.protos.MessageKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.zapia.wpp.api.ws.binary.protos.MessageKey) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object remoteJid_ = "";
    /**
     * <code>optional string remoteJid = 1;</code>
     * @return Whether the remoteJid field is set.
     */
    public boolean hasRemoteJid() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string remoteJid = 1;</code>
     * @return The remoteJid.
     */
    public java.lang.String getRemoteJid() {
      java.lang.Object ref = remoteJid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          remoteJid_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string remoteJid = 1;</code>
     * @return The bytes for remoteJid.
     */
    public com.google.protobuf.ByteString
        getRemoteJidBytes() {
      java.lang.Object ref = remoteJid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        remoteJid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string remoteJid = 1;</code>
     * @param value The remoteJid to set.
     * @return This builder for chaining.
     */
    public Builder setRemoteJid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      remoteJid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string remoteJid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRemoteJid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      remoteJid_ = getDefaultInstance().getRemoteJid();
      onChanged();
      return this;
    }
    /**
     * <code>optional string remoteJid = 1;</code>
     * @param value The bytes for remoteJid to set.
     * @return This builder for chaining.
     */
    public Builder setRemoteJidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      remoteJid_ = value;
      onChanged();
      return this;
    }

    private boolean fromMe_ ;
    /**
     * <code>optional bool fromMe = 2;</code>
     * @return Whether the fromMe field is set.
     */
    @java.lang.Override
    public boolean hasFromMe() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bool fromMe = 2;</code>
     * @return The fromMe.
     */
    @java.lang.Override
    public boolean getFromMe() {
      return fromMe_;
    }
    /**
     * <code>optional bool fromMe = 2;</code>
     * @param value The fromMe to set.
     * @return This builder for chaining.
     */
    public Builder setFromMe(boolean value) {
      bitField0_ |= 0x00000002;
      fromMe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool fromMe = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFromMe() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fromMe_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>optional string id = 3;</code>
     * @return Whether the id field is set.
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string id = 3;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          id_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string id = 3;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string id = 3;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string id = 3;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object participant_ = "";
    /**
     * <code>optional string participant = 4;</code>
     * @return Whether the participant field is set.
     */
    public boolean hasParticipant() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional string participant = 4;</code>
     * @return The participant.
     */
    public java.lang.String getParticipant() {
      java.lang.Object ref = participant_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          participant_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string participant = 4;</code>
     * @return The bytes for participant.
     */
    public com.google.protobuf.ByteString
        getParticipantBytes() {
      java.lang.Object ref = participant_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        participant_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string participant = 4;</code>
     * @param value The participant to set.
     * @return This builder for chaining.
     */
    public Builder setParticipant(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
      participant_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string participant = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearParticipant() {
      bitField0_ = (bitField0_ & ~0x00000008);
      participant_ = getDefaultInstance().getParticipant();
      onChanged();
      return this;
    }
    /**
     * <code>optional string participant = 4;</code>
     * @param value The bytes for participant to set.
     * @return This builder for chaining.
     */
    public Builder setParticipantBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
      participant_ = value;
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


    // @@protoc_insertion_point(builder_scope:binary.MessageKey)
  }

  // @@protoc_insertion_point(class_scope:binary.MessageKey)
  private static final br.com.zapia.wpp.api.ws.binary.protos.MessageKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.zapia.wpp.api.ws.binary.protos.MessageKey();
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.MessageKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<MessageKey>
      PARSER = new com.google.protobuf.AbstractParser<MessageKey>() {
    @java.lang.Override
    public MessageKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MessageKey(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MessageKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MessageKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.MessageKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

