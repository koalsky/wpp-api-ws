// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

/**
 * Protobuf type {@code binary.CompanionRegData}
 */
public final class CompanionRegData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.CompanionRegData)
    CompanionRegDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompanionRegData.newBuilder() to construct.
  private CompanionRegData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompanionRegData() {
    eRegid_ = com.google.protobuf.ByteString.EMPTY;
    eKeytype_ = com.google.protobuf.ByteString.EMPTY;
    eIdent_ = com.google.protobuf.ByteString.EMPTY;
    eSkeyId_ = com.google.protobuf.ByteString.EMPTY;
    eSkeyVal_ = com.google.protobuf.ByteString.EMPTY;
    eSkeySig_ = com.google.protobuf.ByteString.EMPTY;
    buildHash_ = com.google.protobuf.ByteString.EMPTY;
    companionProps_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompanionRegData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CompanionRegData(
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
            eRegid_ = input.readBytes();
            break;
          }
          case 18: {
            bitField0_ |= 0x00000002;
            eKeytype_ = input.readBytes();
            break;
          }
          case 26: {
            bitField0_ |= 0x00000004;
            eIdent_ = input.readBytes();
            break;
          }
          case 34: {
            bitField0_ |= 0x00000008;
            eSkeyId_ = input.readBytes();
            break;
          }
          case 42: {
            bitField0_ |= 0x00000010;
            eSkeyVal_ = input.readBytes();
            break;
          }
          case 50: {
            bitField0_ |= 0x00000020;
            eSkeySig_ = input.readBytes();
            break;
          }
          case 58: {
            bitField0_ |= 0x00000040;
            buildHash_ = input.readBytes();
            break;
          }
          case 66: {
            bitField0_ |= 0x00000080;
            companionProps_ = input.readBytes();
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
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_CompanionRegData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_CompanionRegData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData.class, br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData.Builder.class);
  }

  private int bitField0_;
  public static final int EREGID_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString eRegid_;
  /**
   * <code>optional bytes eRegid = 1;</code>
   * @return Whether the eRegid field is set.
   */
  @java.lang.Override
  public boolean hasERegid() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional bytes eRegid = 1;</code>
   * @return The eRegid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getERegid() {
    return eRegid_;
  }

  public static final int EKEYTYPE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString eKeytype_;
  /**
   * <code>optional bytes eKeytype = 2;</code>
   * @return Whether the eKeytype field is set.
   */
  @java.lang.Override
  public boolean hasEKeytype() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional bytes eKeytype = 2;</code>
   * @return The eKeytype.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEKeytype() {
    return eKeytype_;
  }

  public static final int EIDENT_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString eIdent_;
  /**
   * <code>optional bytes eIdent = 3;</code>
   * @return Whether the eIdent field is set.
   */
  @java.lang.Override
  public boolean hasEIdent() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional bytes eIdent = 3;</code>
   * @return The eIdent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEIdent() {
    return eIdent_;
  }

  public static final int ESKEYID_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString eSkeyId_;
  /**
   * <code>optional bytes eSkeyId = 4;</code>
   * @return Whether the eSkeyId field is set.
   */
  @java.lang.Override
  public boolean hasESkeyId() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional bytes eSkeyId = 4;</code>
   * @return The eSkeyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getESkeyId() {
    return eSkeyId_;
  }

  public static final int ESKEYVAL_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString eSkeyVal_;
  /**
   * <code>optional bytes eSkeyVal = 5;</code>
   * @return Whether the eSkeyVal field is set.
   */
  @java.lang.Override
  public boolean hasESkeyVal() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <code>optional bytes eSkeyVal = 5;</code>
   * @return The eSkeyVal.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getESkeyVal() {
    return eSkeyVal_;
  }

  public static final int ESKEYSIG_FIELD_NUMBER = 6;
  private com.google.protobuf.ByteString eSkeySig_;
  /**
   * <code>optional bytes eSkeySig = 6;</code>
   * @return Whether the eSkeySig field is set.
   */
  @java.lang.Override
  public boolean hasESkeySig() {
    return ((bitField0_ & 0x00000020) != 0);
  }
  /**
   * <code>optional bytes eSkeySig = 6;</code>
   * @return The eSkeySig.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getESkeySig() {
    return eSkeySig_;
  }

  public static final int BUILDHASH_FIELD_NUMBER = 7;
  private com.google.protobuf.ByteString buildHash_;
  /**
   * <code>optional bytes buildHash = 7;</code>
   * @return Whether the buildHash field is set.
   */
  @java.lang.Override
  public boolean hasBuildHash() {
    return ((bitField0_ & 0x00000040) != 0);
  }
  /**
   * <code>optional bytes buildHash = 7;</code>
   * @return The buildHash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBuildHash() {
    return buildHash_;
  }

  public static final int COMPANIONPROPS_FIELD_NUMBER = 8;
  private com.google.protobuf.ByteString companionProps_;
  /**
   * <code>optional bytes companionProps = 8;</code>
   * @return Whether the companionProps field is set.
   */
  @java.lang.Override
  public boolean hasCompanionProps() {
    return ((bitField0_ & 0x00000080) != 0);
  }
  /**
   * <code>optional bytes companionProps = 8;</code>
   * @return The companionProps.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCompanionProps() {
    return companionProps_;
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
      output.writeBytes(1, eRegid_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBytes(2, eKeytype_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeBytes(3, eIdent_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeBytes(4, eSkeyId_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeBytes(5, eSkeyVal_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      output.writeBytes(6, eSkeySig_);
    }
    if (((bitField0_ & 0x00000040) != 0)) {
      output.writeBytes(7, buildHash_);
    }
    if (((bitField0_ & 0x00000080) != 0)) {
      output.writeBytes(8, companionProps_);
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
        .computeBytesSize(1, eRegid_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, eKeytype_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, eIdent_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, eSkeyId_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, eSkeyVal_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(6, eSkeySig_);
    }
    if (((bitField0_ & 0x00000040) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(7, buildHash_);
    }
    if (((bitField0_ & 0x00000080) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(8, companionProps_);
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
    if (!(obj instanceof br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData)) {
      return super.equals(obj);
    }
    br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData other = (br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData) obj;

    if (hasERegid() != other.hasERegid()) return false;
    if (hasERegid()) {
      if (!getERegid()
          .equals(other.getERegid())) return false;
    }
    if (hasEKeytype() != other.hasEKeytype()) return false;
    if (hasEKeytype()) {
      if (!getEKeytype()
          .equals(other.getEKeytype())) return false;
    }
    if (hasEIdent() != other.hasEIdent()) return false;
    if (hasEIdent()) {
      if (!getEIdent()
          .equals(other.getEIdent())) return false;
    }
    if (hasESkeyId() != other.hasESkeyId()) return false;
    if (hasESkeyId()) {
      if (!getESkeyId()
          .equals(other.getESkeyId())) return false;
    }
    if (hasESkeyVal() != other.hasESkeyVal()) return false;
    if (hasESkeyVal()) {
      if (!getESkeyVal()
          .equals(other.getESkeyVal())) return false;
    }
    if (hasESkeySig() != other.hasESkeySig()) return false;
    if (hasESkeySig()) {
      if (!getESkeySig()
          .equals(other.getESkeySig())) return false;
    }
    if (hasBuildHash() != other.hasBuildHash()) return false;
    if (hasBuildHash()) {
      if (!getBuildHash()
          .equals(other.getBuildHash())) return false;
    }
    if (hasCompanionProps() != other.hasCompanionProps()) return false;
    if (hasCompanionProps()) {
      if (!getCompanionProps()
          .equals(other.getCompanionProps())) return false;
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
    if (hasERegid()) {
      hash = (37 * hash) + EREGID_FIELD_NUMBER;
      hash = (53 * hash) + getERegid().hashCode();
    }
    if (hasEKeytype()) {
      hash = (37 * hash) + EKEYTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getEKeytype().hashCode();
    }
    if (hasEIdent()) {
      hash = (37 * hash) + EIDENT_FIELD_NUMBER;
      hash = (53 * hash) + getEIdent().hashCode();
    }
    if (hasESkeyId()) {
      hash = (37 * hash) + ESKEYID_FIELD_NUMBER;
      hash = (53 * hash) + getESkeyId().hashCode();
    }
    if (hasESkeyVal()) {
      hash = (37 * hash) + ESKEYVAL_FIELD_NUMBER;
      hash = (53 * hash) + getESkeyVal().hashCode();
    }
    if (hasESkeySig()) {
      hash = (37 * hash) + ESKEYSIG_FIELD_NUMBER;
      hash = (53 * hash) + getESkeySig().hashCode();
    }
    if (hasBuildHash()) {
      hash = (37 * hash) + BUILDHASH_FIELD_NUMBER;
      hash = (53 * hash) + getBuildHash().hashCode();
    }
    if (hasCompanionProps()) {
      hash = (37 * hash) + COMPANIONPROPS_FIELD_NUMBER;
      hash = (53 * hash) + getCompanionProps().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData parseFrom(
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
  public static Builder newBuilder(br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData prototype) {
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
   * Protobuf type {@code binary.CompanionRegData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.CompanionRegData)
      br.com.zapia.wpp.api.ws.binary.protos.CompanionRegDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_CompanionRegData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_CompanionRegData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData.class, br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData.Builder.class);
    }

    // Construct using br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData.newBuilder()
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
      eRegid_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      eKeytype_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      eIdent_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      eSkeyId_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      eSkeyVal_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      eSkeySig_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000020);
      buildHash_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000040);
      companionProps_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000080);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_CompanionRegData_descriptor;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData getDefaultInstanceForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData build() {
      br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData buildPartial() {
      br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData result = new br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.eRegid_ = eRegid_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.eKeytype_ = eKeytype_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.eIdent_ = eIdent_;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        to_bitField0_ |= 0x00000008;
      }
      result.eSkeyId_ = eSkeyId_;
      if (((from_bitField0_ & 0x00000010) != 0)) {
        to_bitField0_ |= 0x00000010;
      }
      result.eSkeyVal_ = eSkeyVal_;
      if (((from_bitField0_ & 0x00000020) != 0)) {
        to_bitField0_ |= 0x00000020;
      }
      result.eSkeySig_ = eSkeySig_;
      if (((from_bitField0_ & 0x00000040) != 0)) {
        to_bitField0_ |= 0x00000040;
      }
      result.buildHash_ = buildHash_;
      if (((from_bitField0_ & 0x00000080) != 0)) {
        to_bitField0_ |= 0x00000080;
      }
      result.companionProps_ = companionProps_;
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
      if (other instanceof br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData) {
        return mergeFrom((br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData other) {
      if (other == br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData.getDefaultInstance()) return this;
      if (other.hasERegid()) {
        setERegid(other.getERegid());
      }
      if (other.hasEKeytype()) {
        setEKeytype(other.getEKeytype());
      }
      if (other.hasEIdent()) {
        setEIdent(other.getEIdent());
      }
      if (other.hasESkeyId()) {
        setESkeyId(other.getESkeyId());
      }
      if (other.hasESkeyVal()) {
        setESkeyVal(other.getESkeyVal());
      }
      if (other.hasESkeySig()) {
        setESkeySig(other.getESkeySig());
      }
      if (other.hasBuildHash()) {
        setBuildHash(other.getBuildHash());
      }
      if (other.hasCompanionProps()) {
        setCompanionProps(other.getCompanionProps());
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
      br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.ByteString eRegid_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes eRegid = 1;</code>
     * @return Whether the eRegid field is set.
     */
    @java.lang.Override
    public boolean hasERegid() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bytes eRegid = 1;</code>
     * @return The eRegid.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getERegid() {
      return eRegid_;
    }
    /**
     * <code>optional bytes eRegid = 1;</code>
     * @param value The eRegid to set.
     * @return This builder for chaining.
     */
    public Builder setERegid(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      eRegid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes eRegid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearERegid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      eRegid_ = getDefaultInstance().getERegid();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString eKeytype_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes eKeytype = 2;</code>
     * @return Whether the eKeytype field is set.
     */
    @java.lang.Override
    public boolean hasEKeytype() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bytes eKeytype = 2;</code>
     * @return The eKeytype.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getEKeytype() {
      return eKeytype_;
    }
    /**
     * <code>optional bytes eKeytype = 2;</code>
     * @param value The eKeytype to set.
     * @return This builder for chaining.
     */
    public Builder setEKeytype(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      eKeytype_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes eKeytype = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEKeytype() {
      bitField0_ = (bitField0_ & ~0x00000002);
      eKeytype_ = getDefaultInstance().getEKeytype();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString eIdent_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes eIdent = 3;</code>
     * @return Whether the eIdent field is set.
     */
    @java.lang.Override
    public boolean hasEIdent() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional bytes eIdent = 3;</code>
     * @return The eIdent.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getEIdent() {
      return eIdent_;
    }
    /**
     * <code>optional bytes eIdent = 3;</code>
     * @param value The eIdent to set.
     * @return This builder for chaining.
     */
    public Builder setEIdent(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      eIdent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes eIdent = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEIdent() {
      bitField0_ = (bitField0_ & ~0x00000004);
      eIdent_ = getDefaultInstance().getEIdent();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString eSkeyId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes eSkeyId = 4;</code>
     * @return Whether the eSkeyId field is set.
     */
    @java.lang.Override
    public boolean hasESkeyId() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional bytes eSkeyId = 4;</code>
     * @return The eSkeyId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getESkeyId() {
      return eSkeyId_;
    }
    /**
     * <code>optional bytes eSkeyId = 4;</code>
     * @param value The eSkeyId to set.
     * @return This builder for chaining.
     */
    public Builder setESkeyId(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
      eSkeyId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes eSkeyId = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearESkeyId() {
      bitField0_ = (bitField0_ & ~0x00000008);
      eSkeyId_ = getDefaultInstance().getESkeyId();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString eSkeyVal_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes eSkeyVal = 5;</code>
     * @return Whether the eSkeyVal field is set.
     */
    @java.lang.Override
    public boolean hasESkeyVal() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional bytes eSkeyVal = 5;</code>
     * @return The eSkeyVal.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getESkeyVal() {
      return eSkeyVal_;
    }
    /**
     * <code>optional bytes eSkeyVal = 5;</code>
     * @param value The eSkeyVal to set.
     * @return This builder for chaining.
     */
    public Builder setESkeyVal(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
      eSkeyVal_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes eSkeyVal = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearESkeyVal() {
      bitField0_ = (bitField0_ & ~0x00000010);
      eSkeyVal_ = getDefaultInstance().getESkeyVal();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString eSkeySig_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes eSkeySig = 6;</code>
     * @return Whether the eSkeySig field is set.
     */
    @java.lang.Override
    public boolean hasESkeySig() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <code>optional bytes eSkeySig = 6;</code>
     * @return The eSkeySig.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getESkeySig() {
      return eSkeySig_;
    }
    /**
     * <code>optional bytes eSkeySig = 6;</code>
     * @param value The eSkeySig to set.
     * @return This builder for chaining.
     */
    public Builder setESkeySig(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
      eSkeySig_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes eSkeySig = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearESkeySig() {
      bitField0_ = (bitField0_ & ~0x00000020);
      eSkeySig_ = getDefaultInstance().getESkeySig();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString buildHash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes buildHash = 7;</code>
     * @return Whether the buildHash field is set.
     */
    @java.lang.Override
    public boolean hasBuildHash() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <code>optional bytes buildHash = 7;</code>
     * @return The buildHash.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBuildHash() {
      return buildHash_;
    }
    /**
     * <code>optional bytes buildHash = 7;</code>
     * @param value The buildHash to set.
     * @return This builder for chaining.
     */
    public Builder setBuildHash(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
      buildHash_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes buildHash = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearBuildHash() {
      bitField0_ = (bitField0_ & ~0x00000040);
      buildHash_ = getDefaultInstance().getBuildHash();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString companionProps_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes companionProps = 8;</code>
     * @return Whether the companionProps field is set.
     */
    @java.lang.Override
    public boolean hasCompanionProps() {
      return ((bitField0_ & 0x00000080) != 0);
    }
    /**
     * <code>optional bytes companionProps = 8;</code>
     * @return The companionProps.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getCompanionProps() {
      return companionProps_;
    }
    /**
     * <code>optional bytes companionProps = 8;</code>
     * @param value The companionProps to set.
     * @return This builder for chaining.
     */
    public Builder setCompanionProps(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
      companionProps_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes companionProps = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearCompanionProps() {
      bitField0_ = (bitField0_ & ~0x00000080);
      companionProps_ = getDefaultInstance().getCompanionProps();
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


    // @@protoc_insertion_point(builder_scope:binary.CompanionRegData)
  }

  // @@protoc_insertion_point(class_scope:binary.CompanionRegData)
  private static final br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData();
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<CompanionRegData>
      PARSER = new com.google.protobuf.AbstractParser<CompanionRegData>() {
    @java.lang.Override
    public CompanionRegData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CompanionRegData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CompanionRegData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompanionRegData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.CompanionRegData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

