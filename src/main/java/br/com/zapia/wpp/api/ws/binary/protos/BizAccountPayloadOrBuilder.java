// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

public interface BizAccountPayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.BizAccountPayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .binary.VerifiedNameCertificate vnameCert = 1;</code>
   * @return Whether the vnameCert field is set.
   */
  boolean hasVnameCert();
  /**
   * <code>optional .binary.VerifiedNameCertificate vnameCert = 1;</code>
   * @return The vnameCert.
   */
  br.com.zapia.wpp.api.ws.binary.protos.VerifiedNameCertificate getVnameCert();
  /**
   * <code>optional .binary.VerifiedNameCertificate vnameCert = 1;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.VerifiedNameCertificateOrBuilder getVnameCertOrBuilder();

  /**
   * <code>optional bytes bizAcctLinkInfo = 2;</code>
   * @return Whether the bizAcctLinkInfo field is set.
   */
  boolean hasBizAcctLinkInfo();
  /**
   * <code>optional bytes bizAcctLinkInfo = 2;</code>
   * @return The bizAcctLinkInfo.
   */
  com.google.protobuf.ByteString getBizAcctLinkInfo();
}
