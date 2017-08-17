// This is a generated file. Not intended for manual editing.
package com.tang.intellij.lua.comment.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.tang.intellij.lua.comment.psi.LuaDocTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.tang.intellij.lua.comment.psi.*;
import com.tang.intellij.lua.search.SearchContext;
import com.tang.intellij.lua.ty.Ty;

public class LuaDocReturnDefImpl extends ASTWrapperPsiElement implements LuaDocReturnDef {

  public LuaDocReturnDefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LuaDocVisitor visitor) {
    visitor.visitReturnDef(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LuaDocVisitor) accept((LuaDocVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LuaDocCommentString getCommentString() {
    return PsiTreeUtil.getChildOfType(this, LuaDocCommentString.class);
  }

  @Override
  @Nullable
  public LuaDocTypeList getTypeList() {
    return PsiTreeUtil.getChildOfType(this, LuaDocTypeList.class);
  }

  @NotNull
  public Ty resolveTypeAt(SearchContext context) {
    return LuaDocPsiImplUtilKt.resolveTypeAt(this, context);
  }

}
