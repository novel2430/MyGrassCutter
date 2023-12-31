// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KJCGEIPACLC.proto

package emu.grasscutter.net.proto;

public final class KJCGEIPACLCOuterClass {
  private KJCGEIPACLCOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KJCGEIPACLCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:KJCGEIPACLC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector PDFGFIKLANM = 11;</code>
     * @return Whether the pDFGFIKLANM field is set.
     */
    boolean hasPDFGFIKLANM();
    /**
     * <code>.Vector PDFGFIKLANM = 11;</code>
     * @return The pDFGFIKLANM.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getPDFGFIKLANM();
    /**
     * <code>.Vector PDFGFIKLANM = 11;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPDFGFIKLANMOrBuilder();

    /**
     * <code>uint32 entity_id = 10;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.Vector target_pos = 12;</code>
     * @return Whether the targetPos field is set.
     */
    boolean hasTargetPos();
    /**
     * <code>.Vector target_pos = 12;</code>
     * @return The targetPos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getTargetPos();
    /**
     * <code>.Vector target_pos = 12;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getTargetPosOrBuilder();
  }
  /**
   * Protobuf type {@code KJCGEIPACLC}
   */
  public static final class KJCGEIPACLC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:KJCGEIPACLC)
      KJCGEIPACLCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KJCGEIPACLC.newBuilder() to construct.
    private KJCGEIPACLC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KJCGEIPACLC() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new KJCGEIPACLC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private KJCGEIPACLC(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 80: {

              entityId_ = input.readUInt32();
              break;
            }
            case 90: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (pDFGFIKLANM_ != null) {
                subBuilder = pDFGFIKLANM_.toBuilder();
              }
              pDFGFIKLANM_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(pDFGFIKLANM_);
                pDFGFIKLANM_ = subBuilder.buildPartial();
              }

              break;
            }
            case 98: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (targetPos_ != null) {
                subBuilder = targetPos_.toBuilder();
              }
              targetPos_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(targetPos_);
                targetPos_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.internal_static_KJCGEIPACLC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.internal_static_KJCGEIPACLC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC.class, emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC.Builder.class);
    }

    public static final int PDFGFIKLANM_FIELD_NUMBER = 11;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector pDFGFIKLANM_;
    /**
     * <code>.Vector PDFGFIKLANM = 11;</code>
     * @return Whether the pDFGFIKLANM field is set.
     */
    @java.lang.Override
    public boolean hasPDFGFIKLANM() {
      return pDFGFIKLANM_ != null;
    }
    /**
     * <code>.Vector PDFGFIKLANM = 11;</code>
     * @return The pDFGFIKLANM.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getPDFGFIKLANM() {
      return pDFGFIKLANM_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pDFGFIKLANM_;
    }
    /**
     * <code>.Vector PDFGFIKLANM = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPDFGFIKLANMOrBuilder() {
      return getPDFGFIKLANM();
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 10;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 10;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int TARGET_POS_FIELD_NUMBER = 12;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector targetPos_;
    /**
     * <code>.Vector target_pos = 12;</code>
     * @return Whether the targetPos field is set.
     */
    @java.lang.Override
    public boolean hasTargetPos() {
      return targetPos_ != null;
    }
    /**
     * <code>.Vector target_pos = 12;</code>
     * @return The targetPos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getTargetPos() {
      return targetPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : targetPos_;
    }
    /**
     * <code>.Vector target_pos = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getTargetPosOrBuilder() {
      return getTargetPos();
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
      if (entityId_ != 0) {
        output.writeUInt32(10, entityId_);
      }
      if (pDFGFIKLANM_ != null) {
        output.writeMessage(11, getPDFGFIKLANM());
      }
      if (targetPos_ != null) {
        output.writeMessage(12, getTargetPos());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, entityId_);
      }
      if (pDFGFIKLANM_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getPDFGFIKLANM());
      }
      if (targetPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getTargetPos());
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
      if (!(obj instanceof emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC other = (emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC) obj;

      if (hasPDFGFIKLANM() != other.hasPDFGFIKLANM()) return false;
      if (hasPDFGFIKLANM()) {
        if (!getPDFGFIKLANM()
            .equals(other.getPDFGFIKLANM())) return false;
      }
      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasTargetPos() != other.hasTargetPos()) return false;
      if (hasTargetPos()) {
        if (!getTargetPos()
            .equals(other.getTargetPos())) return false;
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
      if (hasPDFGFIKLANM()) {
        hash = (37 * hash) + PDFGFIKLANM_FIELD_NUMBER;
        hash = (53 * hash) + getPDFGFIKLANM().hashCode();
      }
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (hasTargetPos()) {
        hash = (37 * hash) + TARGET_POS_FIELD_NUMBER;
        hash = (53 * hash) + getTargetPos().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC prototype) {
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
     * Protobuf type {@code KJCGEIPACLC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:KJCGEIPACLC)
        emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.internal_static_KJCGEIPACLC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.internal_static_KJCGEIPACLC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC.class, emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC.newBuilder()
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
        if (pDFGFIKLANMBuilder_ == null) {
          pDFGFIKLANM_ = null;
        } else {
          pDFGFIKLANM_ = null;
          pDFGFIKLANMBuilder_ = null;
        }
        entityId_ = 0;

        if (targetPosBuilder_ == null) {
          targetPos_ = null;
        } else {
          targetPos_ = null;
          targetPosBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.internal_static_KJCGEIPACLC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC build() {
        emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC buildPartial() {
        emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC result = new emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC(this);
        if (pDFGFIKLANMBuilder_ == null) {
          result.pDFGFIKLANM_ = pDFGFIKLANM_;
        } else {
          result.pDFGFIKLANM_ = pDFGFIKLANMBuilder_.build();
        }
        result.entityId_ = entityId_;
        if (targetPosBuilder_ == null) {
          result.targetPos_ = targetPos_;
        } else {
          result.targetPos_ = targetPosBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC) {
          return mergeFrom((emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC other) {
        if (other == emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC.getDefaultInstance()) return this;
        if (other.hasPDFGFIKLANM()) {
          mergePDFGFIKLANM(other.getPDFGFIKLANM());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasTargetPos()) {
          mergeTargetPos(other.getTargetPos());
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
        emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector pDFGFIKLANM_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> pDFGFIKLANMBuilder_;
      /**
       * <code>.Vector PDFGFIKLANM = 11;</code>
       * @return Whether the pDFGFIKLANM field is set.
       */
      public boolean hasPDFGFIKLANM() {
        return pDFGFIKLANMBuilder_ != null || pDFGFIKLANM_ != null;
      }
      /**
       * <code>.Vector PDFGFIKLANM = 11;</code>
       * @return The pDFGFIKLANM.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getPDFGFIKLANM() {
        if (pDFGFIKLANMBuilder_ == null) {
          return pDFGFIKLANM_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pDFGFIKLANM_;
        } else {
          return pDFGFIKLANMBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector PDFGFIKLANM = 11;</code>
       */
      public Builder setPDFGFIKLANM(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (pDFGFIKLANMBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pDFGFIKLANM_ = value;
          onChanged();
        } else {
          pDFGFIKLANMBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector PDFGFIKLANM = 11;</code>
       */
      public Builder setPDFGFIKLANM(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (pDFGFIKLANMBuilder_ == null) {
          pDFGFIKLANM_ = builderForValue.build();
          onChanged();
        } else {
          pDFGFIKLANMBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector PDFGFIKLANM = 11;</code>
       */
      public Builder mergePDFGFIKLANM(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (pDFGFIKLANMBuilder_ == null) {
          if (pDFGFIKLANM_ != null) {
            pDFGFIKLANM_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(pDFGFIKLANM_).mergeFrom(value).buildPartial();
          } else {
            pDFGFIKLANM_ = value;
          }
          onChanged();
        } else {
          pDFGFIKLANMBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector PDFGFIKLANM = 11;</code>
       */
      public Builder clearPDFGFIKLANM() {
        if (pDFGFIKLANMBuilder_ == null) {
          pDFGFIKLANM_ = null;
          onChanged();
        } else {
          pDFGFIKLANM_ = null;
          pDFGFIKLANMBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector PDFGFIKLANM = 11;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getPDFGFIKLANMBuilder() {
        
        onChanged();
        return getPDFGFIKLANMFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector PDFGFIKLANM = 11;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPDFGFIKLANMOrBuilder() {
        if (pDFGFIKLANMBuilder_ != null) {
          return pDFGFIKLANMBuilder_.getMessageOrBuilder();
        } else {
          return pDFGFIKLANM_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pDFGFIKLANM_;
        }
      }
      /**
       * <code>.Vector PDFGFIKLANM = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getPDFGFIKLANMFieldBuilder() {
        if (pDFGFIKLANMBuilder_ == null) {
          pDFGFIKLANMBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getPDFGFIKLANM(),
                  getParentForChildren(),
                  isClean());
          pDFGFIKLANM_ = null;
        }
        return pDFGFIKLANMBuilder_;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 10;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 10;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector targetPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> targetPosBuilder_;
      /**
       * <code>.Vector target_pos = 12;</code>
       * @return Whether the targetPos field is set.
       */
      public boolean hasTargetPos() {
        return targetPosBuilder_ != null || targetPos_ != null;
      }
      /**
       * <code>.Vector target_pos = 12;</code>
       * @return The targetPos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getTargetPos() {
        if (targetPosBuilder_ == null) {
          return targetPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : targetPos_;
        } else {
          return targetPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector target_pos = 12;</code>
       */
      public Builder setTargetPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (targetPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          targetPos_ = value;
          onChanged();
        } else {
          targetPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector target_pos = 12;</code>
       */
      public Builder setTargetPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (targetPosBuilder_ == null) {
          targetPos_ = builderForValue.build();
          onChanged();
        } else {
          targetPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector target_pos = 12;</code>
       */
      public Builder mergeTargetPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (targetPosBuilder_ == null) {
          if (targetPos_ != null) {
            targetPos_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(targetPos_).mergeFrom(value).buildPartial();
          } else {
            targetPos_ = value;
          }
          onChanged();
        } else {
          targetPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector target_pos = 12;</code>
       */
      public Builder clearTargetPos() {
        if (targetPosBuilder_ == null) {
          targetPos_ = null;
          onChanged();
        } else {
          targetPos_ = null;
          targetPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector target_pos = 12;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getTargetPosBuilder() {
        
        onChanged();
        return getTargetPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector target_pos = 12;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getTargetPosOrBuilder() {
        if (targetPosBuilder_ != null) {
          return targetPosBuilder_.getMessageOrBuilder();
        } else {
          return targetPos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : targetPos_;
        }
      }
      /**
       * <code>.Vector target_pos = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getTargetPosFieldBuilder() {
        if (targetPosBuilder_ == null) {
          targetPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getTargetPos(),
                  getParentForChildren(),
                  isClean());
          targetPos_ = null;
        }
        return targetPosBuilder_;
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


      // @@protoc_insertion_point(builder_scope:KJCGEIPACLC)
    }

    // @@protoc_insertion_point(class_scope:KJCGEIPACLC)
    private static final emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC();
    }

    public static emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KJCGEIPACLC>
        PARSER = new com.google.protobuf.AbstractParser<KJCGEIPACLC>() {
      @java.lang.Override
      public KJCGEIPACLC parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new KJCGEIPACLC(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<KJCGEIPACLC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KJCGEIPACLC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.KJCGEIPACLCOuterClass.KJCGEIPACLC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KJCGEIPACLC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_KJCGEIPACLC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021KJCGEIPACLC.proto\032\014Vector.proto\"[\n\013KJC" +
      "GEIPACLC\022\034\n\013PDFGFIKLANM\030\013 \001(\0132\007.Vector\022\021" +
      "\n\tentity_id\030\n \001(\r\022\033\n\ntarget_pos\030\014 \001(\0132\007." +
      "VectorB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_KJCGEIPACLC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_KJCGEIPACLC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_KJCGEIPACLC_descriptor,
        new java.lang.String[] { "PDFGFIKLANM", "EntityId", "TargetPos", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
