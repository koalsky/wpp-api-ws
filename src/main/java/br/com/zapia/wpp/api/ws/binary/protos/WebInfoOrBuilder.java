// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

public interface WebInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.WebInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string refToken = 1;</code>
   * @return Whether the refToken field is set.
   */
  boolean hasRefToken();
  /**
   * <code>optional string refToken = 1;</code>
   * @return The refToken.
   */
  java.lang.String getRefToken();
  /**
   * <code>optional string refToken = 1;</code>
   * @return The bytes for refToken.
   */
  com.google.protobuf.ByteString
      getRefTokenBytes();

  /**
   * <code>optional string version = 2;</code>
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   * <code>optional string version = 2;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <code>optional string version = 2;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <code>optional .binary.WebdPayload webdPayload = 3;</code>
   * @return Whether the webdPayload field is set.
   */
  boolean hasWebdPayload();
  /**
   * <code>optional .binary.WebdPayload webdPayload = 3;</code>
   * @return The webdPayload.
   */
  br.com.zapia.wpp.api.ws.binary.protos.WebdPayload getWebdPayload();
  /**
   * <code>optional .binary.WebdPayload webdPayload = 3;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.WebdPayloadOrBuilder getWebdPayloadOrBuilder();

  /**
   * <code>optional .binary.WebInfo.WebInfoWebSubPlatform webSubPlatform = 4;</code>
   * @return Whether the webSubPlatform field is set.
   */
  boolean hasWebSubPlatform();
  /**
   * <code>optional .binary.WebInfo.WebInfoWebSubPlatform webSubPlatform = 4;</code>
   * @return The webSubPlatform.
   */
  br.com.zapia.wpp.api.ws.binary.protos.WebInfo.WebInfoWebSubPlatform getWebSubPlatform();
}
