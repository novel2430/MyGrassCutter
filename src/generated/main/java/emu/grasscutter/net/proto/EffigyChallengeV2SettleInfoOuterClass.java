// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EffigyChallengeV2SettleInfo.proto

package emu.grasscutter.net.proto;

public final class EffigyChallengeV2SettleInfoOuterClass {
  private EffigyChallengeV2SettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EffigyChallengeV2SettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EffigyChallengeV2SettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 CMCCNBNFAJE = 11;</code>
     * @return The cMCCNBNFAJE.
     */
    int getCMCCNBNFAJE();

    /**
     * <code>bool LFNCGGFLHPL = 9;</code>
     * @return The lFNCGGFLHPL.
     */
    boolean getLFNCGGFLHPL();

    /**
     * <code>uint32 DCAKCNEDDEB = 12;</code>
     * @return The dCAKCNEDDEB.
     */
    int getDCAKCNEDDEB();

    /**
     * <code>uint32 challenge_mode_difficulty = 3;</code>
     * @return The challengeModeDifficulty.
     */
    int getChallengeModeDifficulty();

    /**
     * <code>bool FOFHONJNIHG = 4;</code>
     * @return The fOFHONJNIHG.
     */
    boolean getFOFHONJNIHG();

    /**
     * <code>uint32 PHNDBBLLHDI = 1;</code>
     * @return The pHNDBBLLHDI.
     */
    int getPHNDBBLLHDI();
  }
  /**
   * <pre>
   * Obf: GKEGGCBBJNB
   * </pre>
   *
   * Protobuf type {@code EffigyChallengeV2SettleInfo}
   */
  public static final class EffigyChallengeV2SettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EffigyChallengeV2SettleInfo)
      EffigyChallengeV2SettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EffigyChallengeV2SettleInfo.newBuilder() to construct.
    private EffigyChallengeV2SettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EffigyChallengeV2SettleInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EffigyChallengeV2SettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EffigyChallengeV2SettleInfo(
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
            case 8: {

              pHNDBBLLHDI_ = input.readUInt32();
              break;
            }
            case 24: {

              challengeModeDifficulty_ = input.readUInt32();
              break;
            }
            case 32: {

              fOFHONJNIHG_ = input.readBool();
              break;
            }
            case 72: {

              lFNCGGFLHPL_ = input.readBool();
              break;
            }
            case 88: {

              cMCCNBNFAJE_ = input.readUInt32();
              break;
            }
            case 96: {

              dCAKCNEDDEB_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.internal_static_EffigyChallengeV2SettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.internal_static_EffigyChallengeV2SettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo.class, emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo.Builder.class);
    }

    public static final int CMCCNBNFAJE_FIELD_NUMBER = 11;
    private int cMCCNBNFAJE_;
    /**
     * <code>uint32 CMCCNBNFAJE = 11;</code>
     * @return The cMCCNBNFAJE.
     */
    @java.lang.Override
    public int getCMCCNBNFAJE() {
      return cMCCNBNFAJE_;
    }

    public static final int LFNCGGFLHPL_FIELD_NUMBER = 9;
    private boolean lFNCGGFLHPL_;
    /**
     * <code>bool LFNCGGFLHPL = 9;</code>
     * @return The lFNCGGFLHPL.
     */
    @java.lang.Override
    public boolean getLFNCGGFLHPL() {
      return lFNCGGFLHPL_;
    }

    public static final int DCAKCNEDDEB_FIELD_NUMBER = 12;
    private int dCAKCNEDDEB_;
    /**
     * <code>uint32 DCAKCNEDDEB = 12;</code>
     * @return The dCAKCNEDDEB.
     */
    @java.lang.Override
    public int getDCAKCNEDDEB() {
      return dCAKCNEDDEB_;
    }

    public static final int CHALLENGE_MODE_DIFFICULTY_FIELD_NUMBER = 3;
    private int challengeModeDifficulty_;
    /**
     * <code>uint32 challenge_mode_difficulty = 3;</code>
     * @return The challengeModeDifficulty.
     */
    @java.lang.Override
    public int getChallengeModeDifficulty() {
      return challengeModeDifficulty_;
    }

    public static final int FOFHONJNIHG_FIELD_NUMBER = 4;
    private boolean fOFHONJNIHG_;
    /**
     * <code>bool FOFHONJNIHG = 4;</code>
     * @return The fOFHONJNIHG.
     */
    @java.lang.Override
    public boolean getFOFHONJNIHG() {
      return fOFHONJNIHG_;
    }

    public static final int PHNDBBLLHDI_FIELD_NUMBER = 1;
    private int pHNDBBLLHDI_;
    /**
     * <code>uint32 PHNDBBLLHDI = 1;</code>
     * @return The pHNDBBLLHDI.
     */
    @java.lang.Override
    public int getPHNDBBLLHDI() {
      return pHNDBBLLHDI_;
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
      if (pHNDBBLLHDI_ != 0) {
        output.writeUInt32(1, pHNDBBLLHDI_);
      }
      if (challengeModeDifficulty_ != 0) {
        output.writeUInt32(3, challengeModeDifficulty_);
      }
      if (fOFHONJNIHG_ != false) {
        output.writeBool(4, fOFHONJNIHG_);
      }
      if (lFNCGGFLHPL_ != false) {
        output.writeBool(9, lFNCGGFLHPL_);
      }
      if (cMCCNBNFAJE_ != 0) {
        output.writeUInt32(11, cMCCNBNFAJE_);
      }
      if (dCAKCNEDDEB_ != 0) {
        output.writeUInt32(12, dCAKCNEDDEB_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pHNDBBLLHDI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, pHNDBBLLHDI_);
      }
      if (challengeModeDifficulty_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, challengeModeDifficulty_);
      }
      if (fOFHONJNIHG_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, fOFHONJNIHG_);
      }
      if (lFNCGGFLHPL_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, lFNCGGFLHPL_);
      }
      if (cMCCNBNFAJE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, cMCCNBNFAJE_);
      }
      if (dCAKCNEDDEB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, dCAKCNEDDEB_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo other = (emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo) obj;

      if (getCMCCNBNFAJE()
          != other.getCMCCNBNFAJE()) return false;
      if (getLFNCGGFLHPL()
          != other.getLFNCGGFLHPL()) return false;
      if (getDCAKCNEDDEB()
          != other.getDCAKCNEDDEB()) return false;
      if (getChallengeModeDifficulty()
          != other.getChallengeModeDifficulty()) return false;
      if (getFOFHONJNIHG()
          != other.getFOFHONJNIHG()) return false;
      if (getPHNDBBLLHDI()
          != other.getPHNDBBLLHDI()) return false;
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
      hash = (37 * hash) + CMCCNBNFAJE_FIELD_NUMBER;
      hash = (53 * hash) + getCMCCNBNFAJE();
      hash = (37 * hash) + LFNCGGFLHPL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getLFNCGGFLHPL());
      hash = (37 * hash) + DCAKCNEDDEB_FIELD_NUMBER;
      hash = (53 * hash) + getDCAKCNEDDEB();
      hash = (37 * hash) + CHALLENGE_MODE_DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeModeDifficulty();
      hash = (37 * hash) + FOFHONJNIHG_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getFOFHONJNIHG());
      hash = (37 * hash) + PHNDBBLLHDI_FIELD_NUMBER;
      hash = (53 * hash) + getPHNDBBLLHDI();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo prototype) {
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
     * <pre>
     * Obf: GKEGGCBBJNB
     * </pre>
     *
     * Protobuf type {@code EffigyChallengeV2SettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EffigyChallengeV2SettleInfo)
        emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.internal_static_EffigyChallengeV2SettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.internal_static_EffigyChallengeV2SettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo.class, emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo.newBuilder()
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
        cMCCNBNFAJE_ = 0;

        lFNCGGFLHPL_ = false;

        dCAKCNEDDEB_ = 0;

        challengeModeDifficulty_ = 0;

        fOFHONJNIHG_ = false;

        pHNDBBLLHDI_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.internal_static_EffigyChallengeV2SettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo build() {
        emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo buildPartial() {
        emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo result = new emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo(this);
        result.cMCCNBNFAJE_ = cMCCNBNFAJE_;
        result.lFNCGGFLHPL_ = lFNCGGFLHPL_;
        result.dCAKCNEDDEB_ = dCAKCNEDDEB_;
        result.challengeModeDifficulty_ = challengeModeDifficulty_;
        result.fOFHONJNIHG_ = fOFHONJNIHG_;
        result.pHNDBBLLHDI_ = pHNDBBLLHDI_;
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
        if (other instanceof emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo other) {
        if (other == emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo.getDefaultInstance()) return this;
        if (other.getCMCCNBNFAJE() != 0) {
          setCMCCNBNFAJE(other.getCMCCNBNFAJE());
        }
        if (other.getLFNCGGFLHPL() != false) {
          setLFNCGGFLHPL(other.getLFNCGGFLHPL());
        }
        if (other.getDCAKCNEDDEB() != 0) {
          setDCAKCNEDDEB(other.getDCAKCNEDDEB());
        }
        if (other.getChallengeModeDifficulty() != 0) {
          setChallengeModeDifficulty(other.getChallengeModeDifficulty());
        }
        if (other.getFOFHONJNIHG() != false) {
          setFOFHONJNIHG(other.getFOFHONJNIHG());
        }
        if (other.getPHNDBBLLHDI() != 0) {
          setPHNDBBLLHDI(other.getPHNDBBLLHDI());
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
        emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cMCCNBNFAJE_ ;
      /**
       * <code>uint32 CMCCNBNFAJE = 11;</code>
       * @return The cMCCNBNFAJE.
       */
      @java.lang.Override
      public int getCMCCNBNFAJE() {
        return cMCCNBNFAJE_;
      }
      /**
       * <code>uint32 CMCCNBNFAJE = 11;</code>
       * @param value The cMCCNBNFAJE to set.
       * @return This builder for chaining.
       */
      public Builder setCMCCNBNFAJE(int value) {
        
        cMCCNBNFAJE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 CMCCNBNFAJE = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCMCCNBNFAJE() {
        
        cMCCNBNFAJE_ = 0;
        onChanged();
        return this;
      }

      private boolean lFNCGGFLHPL_ ;
      /**
       * <code>bool LFNCGGFLHPL = 9;</code>
       * @return The lFNCGGFLHPL.
       */
      @java.lang.Override
      public boolean getLFNCGGFLHPL() {
        return lFNCGGFLHPL_;
      }
      /**
       * <code>bool LFNCGGFLHPL = 9;</code>
       * @param value The lFNCGGFLHPL to set.
       * @return This builder for chaining.
       */
      public Builder setLFNCGGFLHPL(boolean value) {
        
        lFNCGGFLHPL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool LFNCGGFLHPL = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearLFNCGGFLHPL() {
        
        lFNCGGFLHPL_ = false;
        onChanged();
        return this;
      }

      private int dCAKCNEDDEB_ ;
      /**
       * <code>uint32 DCAKCNEDDEB = 12;</code>
       * @return The dCAKCNEDDEB.
       */
      @java.lang.Override
      public int getDCAKCNEDDEB() {
        return dCAKCNEDDEB_;
      }
      /**
       * <code>uint32 DCAKCNEDDEB = 12;</code>
       * @param value The dCAKCNEDDEB to set.
       * @return This builder for chaining.
       */
      public Builder setDCAKCNEDDEB(int value) {
        
        dCAKCNEDDEB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DCAKCNEDDEB = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearDCAKCNEDDEB() {
        
        dCAKCNEDDEB_ = 0;
        onChanged();
        return this;
      }

      private int challengeModeDifficulty_ ;
      /**
       * <code>uint32 challenge_mode_difficulty = 3;</code>
       * @return The challengeModeDifficulty.
       */
      @java.lang.Override
      public int getChallengeModeDifficulty() {
        return challengeModeDifficulty_;
      }
      /**
       * <code>uint32 challenge_mode_difficulty = 3;</code>
       * @param value The challengeModeDifficulty to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeModeDifficulty(int value) {
        
        challengeModeDifficulty_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_mode_difficulty = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeModeDifficulty() {
        
        challengeModeDifficulty_ = 0;
        onChanged();
        return this;
      }

      private boolean fOFHONJNIHG_ ;
      /**
       * <code>bool FOFHONJNIHG = 4;</code>
       * @return The fOFHONJNIHG.
       */
      @java.lang.Override
      public boolean getFOFHONJNIHG() {
        return fOFHONJNIHG_;
      }
      /**
       * <code>bool FOFHONJNIHG = 4;</code>
       * @param value The fOFHONJNIHG to set.
       * @return This builder for chaining.
       */
      public Builder setFOFHONJNIHG(boolean value) {
        
        fOFHONJNIHG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool FOFHONJNIHG = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearFOFHONJNIHG() {
        
        fOFHONJNIHG_ = false;
        onChanged();
        return this;
      }

      private int pHNDBBLLHDI_ ;
      /**
       * <code>uint32 PHNDBBLLHDI = 1;</code>
       * @return The pHNDBBLLHDI.
       */
      @java.lang.Override
      public int getPHNDBBLLHDI() {
        return pHNDBBLLHDI_;
      }
      /**
       * <code>uint32 PHNDBBLLHDI = 1;</code>
       * @param value The pHNDBBLLHDI to set.
       * @return This builder for chaining.
       */
      public Builder setPHNDBBLLHDI(int value) {
        
        pHNDBBLLHDI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 PHNDBBLLHDI = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPHNDBBLLHDI() {
        
        pHNDBBLLHDI_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EffigyChallengeV2SettleInfo)
    }

    // @@protoc_insertion_point(class_scope:EffigyChallengeV2SettleInfo)
    private static final emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo();
    }

    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EffigyChallengeV2SettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<EffigyChallengeV2SettleInfo>() {
      @java.lang.Override
      public EffigyChallengeV2SettleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EffigyChallengeV2SettleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EffigyChallengeV2SettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EffigyChallengeV2SettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EffigyChallengeV2SettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EffigyChallengeV2SettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!EffigyChallengeV2SettleInfo.proto\"\251\001\n\033" +
      "EffigyChallengeV2SettleInfo\022\023\n\013CMCCNBNFA" +
      "JE\030\013 \001(\r\022\023\n\013LFNCGGFLHPL\030\t \001(\010\022\023\n\013DCAKCNE" +
      "DDEB\030\014 \001(\r\022!\n\031challenge_mode_difficulty\030" +
      "\003 \001(\r\022\023\n\013FOFHONJNIHG\030\004 \001(\010\022\023\n\013PHNDBBLLHD" +
      "I\030\001 \001(\rB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EffigyChallengeV2SettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EffigyChallengeV2SettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EffigyChallengeV2SettleInfo_descriptor,
        new java.lang.String[] { "CMCCNBNFAJE", "LFNCGGFLHPL", "DCAKCNEDDEB", "ChallengeModeDifficulty", "FOFHONJNIHG", "PHNDBBLLHDI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
