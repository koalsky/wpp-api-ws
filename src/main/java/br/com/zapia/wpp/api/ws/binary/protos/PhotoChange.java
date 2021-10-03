// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

/**
 * Protobuf type {@code binary.PhotoChange}
 */
public final class PhotoChange extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.PhotoChange)
    PhotoChangeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PhotoChange.newBuilder() to construct.
  private PhotoChange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PhotoChange() {
    oldPhoto_ = com.google.protobuf.ByteString.EMPTY;
    newPhoto_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PhotoChange();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PhotoChange(
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
            oldPhoto_ = input.readBytes();
            break;
          }
          case 18: {
            bitField0_ |= 0x00000002;
            newPhoto_ = input.readBytes();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            newPhotoId_ = input.readUInt32();
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
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_PhotoChange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_PhotoChange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.zapia.wpp.api.ws.binary.protos.PhotoChange.class, br.com.zapia.wpp.api.ws.binary.protos.PhotoChange.Builder.class);
  }

  private int bitField0_;
  public static final int OLDPHOTO_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString oldPhoto_;
  /**
   * <code>optional bytes oldPhoto = 1;</code>
   * @return Whether the oldPhoto field is set.
   */
  @java.lang.Override
  public boolean hasOldPhoto() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional bytes oldPhoto = 1;</code>
   * @return The oldPhoto.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOldPhoto() {
    return oldPhoto_;
  }

  public static final int NEWPHOTO_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString newPhoto_;
  /**
   * <code>optional bytes newPhoto = 2;</code>
   * @return Whether the newPhoto field is set.
   */
  @java.lang.Override
  public boolean hasNewPhoto() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional bytes newPhoto = 2;</code>
   * @return The newPhoto.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNewPhoto() {
    return newPhoto_;
  }

  public static final int NEWPHOTOID_FIELD_NUMBER = 3;
  private int newPhotoId_;
  /**
   * <code>optional uint32 newPhotoId = 3;</code>
   * @return Whether the newPhotoId field is set.
   */
  @java.lang.Override
  public boolean hasNewPhotoId() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional uint32 newPhotoId = 3;</code>
   * @return The newPhotoId.
   */
  @java.lang.Override
  public int getNewPhotoId() {
    return newPhotoId_;
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
      output.writeBytes(1, oldPhoto_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBytes(2, newPhoto_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeUInt32(3, newPhotoId_);
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
        .computeBytesSize(1, oldPhoto_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, newPhoto_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, newPhotoId_);
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
    if (!(obj instanceof br.com.zapia.wpp.api.ws.binary.protos.PhotoChange)) {
      return super.equals(obj);
    }
    br.com.zapia.wpp.api.ws.binary.protos.PhotoChange other = (br.com.zapia.wpp.api.ws.binary.protos.PhotoChange) obj;

    if (hasOldPhoto() != other.hasOldPhoto()) return false;
    if (hasOldPhoto()) {
      if (!getOldPhoto()
          .equals(other.getOldPhoto())) return false;
    }
    if (hasNewPhoto() != other.hasNewPhoto()) return false;
    if (hasNewPhoto()) {
      if (!getNewPhoto()
          .equals(other.getNewPhoto())) return false;
    }
    if (hasNewPhotoId() != other.hasNewPhotoId()) return false;
    if (hasNewPhotoId()) {
      if (getNewPhotoId()
          != other.getNewPhotoId()) return false;
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
    if (hasOldPhoto()) {
      hash = (37 * hash) + OLDPHOTO_FIELD_NUMBER;
      hash = (53 * hash) + getOldPhoto().hashCode();
    }
    if (hasNewPhoto()) {
      hash = (37 * hash) + NEWPHOTO_FIELD_NUMBER;
      hash = (53 * hash) + getNewPhoto().hashCode();
    }
    if (hasNewPhotoId()) {
      hash = (37 * hash) + NEWPHOTOID_FIELD_NUMBER;
      hash = (53 * hash) + getNewPhotoId();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.PhotoChange parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.PhotoChange parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.PhotoChange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.PhotoChange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.PhotoChange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.PhotoChange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.PhotoChange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.PhotoChange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.PhotoChange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.PhotoChange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.PhotoChange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.PhotoChange parseFrom(
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
  public static Builder newBuilder(br.com.zapia.wpp.api.ws.binary.protos.PhotoChange prototype) {
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
   * Protobuf type {@code binary.PhotoChange}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.PhotoChange)
      br.com.zapia.wpp.api.ws.binary.protos.PhotoChangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_PhotoChange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_PhotoChange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.zapia.wpp.api.ws.binary.protos.PhotoChange.class, br.com.zapia.wpp.api.ws.binary.protos.PhotoChange.Builder.class);
    }

    // Construct using br.com.zapia.wpp.api.ws.binary.protos.PhotoChange.newBuilder()
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
      oldPhoto_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      newPhoto_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      newPhotoId_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_PhotoChange_descriptor;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.PhotoChange getDefaultInstanceForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.PhotoChange.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.PhotoChange build() {
      br.com.zapia.wpp.api.ws.binary.protos.PhotoChange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.PhotoChange buildPartial() {
      br.com.zapia.wpp.api.ws.binary.protos.PhotoChange result = new br.com.zapia.wpp.api.ws.binary.protos.PhotoChange(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.oldPhoto_ = oldPhoto_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.newPhoto_ = newPhoto_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.newPhotoId_ = newPhotoId_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof br.com.zapia.wpp.api.ws.binary.protos.PhotoChange) {
        return mergeFrom((br.com.zapia.wpp.api.ws.binary.protos.PhotoChange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.zapia.wpp.api.ws.binary.protos.PhotoChange other) {
      if (other == br.com.zapia.wpp.api.ws.binary.protos.PhotoChange.getDefaultInstance()) return this;
      if (other.hasOldPhoto()) {
        setOldPhoto(other.getOldPhoto());
      }
      if (other.hasNewPhoto()) {
        setNewPhoto(other.getNewPhoto());
      }
      if (other.hasNewPhotoId()) {
        setNewPhotoId(other.getNewPhotoId());
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
      br.com.zapia.wpp.api.ws.binary.protos.PhotoChange parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.zapia.wpp.api.ws.binary.protos.PhotoChange) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.ByteString oldPhoto_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes oldPhoto = 1;</code>
     * @return Whether the oldPhoto field is set.
     */
    @java.lang.Override
    public boolean hasOldPhoto() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bytes oldPhoto = 1;</code>
     * @return The oldPhoto.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getOldPhoto() {
      return oldPhoto_;
    }
    /**
     * <code>optional bytes oldPhoto = 1;</code>
     * @param value The oldPhoto to set.
     * @return This builder for chaining.
     */
    public Builder setOldPhoto(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      oldPhoto_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes oldPhoto = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOldPhoto() {
      bitField0_ = (bitField0_ & ~0x00000001);
      oldPhoto_ = getDefaultInstance().getOldPhoto();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString newPhoto_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes newPhoto = 2;</code>
     * @return Whether the newPhoto field is set.
     */
    @java.lang.Override
    public boolean hasNewPhoto() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bytes newPhoto = 2;</code>
     * @return The newPhoto.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getNewPhoto() {
      return newPhoto_;
    }
    /**
     * <code>optional bytes newPhoto = 2;</code>
     * @param value The newPhoto to set.
     * @return This builder for chaining.
     */
    public Builder setNewPhoto(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      newPhoto_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes newPhoto = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNewPhoto() {
      bitField0_ = (bitField0_ & ~0x00000002);
      newPhoto_ = getDefaultInstance().getNewPhoto();
      onChanged();
      return this;
    }

    private int newPhotoId_ ;
    /**
     * <code>optional uint32 newPhotoId = 3;</code>
     * @return Whether the newPhotoId field is set.
     */
    @java.lang.Override
    public boolean hasNewPhotoId() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional uint32 newPhotoId = 3;</code>
     * @return The newPhotoId.
     */
    @java.lang.Override
    public int getNewPhotoId() {
      return newPhotoId_;
    }
    /**
     * <code>optional uint32 newPhotoId = 3;</code>
     * @param value The newPhotoId to set.
     * @return This builder for chaining.
     */
    public Builder setNewPhotoId(int value) {
      bitField0_ |= 0x00000004;
      newPhotoId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 newPhotoId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNewPhotoId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      newPhotoId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:binary.PhotoChange)
  }

  // @@protoc_insertion_point(class_scope:binary.PhotoChange)
  private static final br.com.zapia.wpp.api.ws.binary.protos.PhotoChange DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.zapia.wpp.api.ws.binary.protos.PhotoChange();
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.PhotoChange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<PhotoChange>
      PARSER = new com.google.protobuf.AbstractParser<PhotoChange>() {
    @java.lang.Override
    public PhotoChange parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PhotoChange(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PhotoChange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PhotoChange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.PhotoChange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

