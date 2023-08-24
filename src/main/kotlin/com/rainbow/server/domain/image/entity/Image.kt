package com.rainbow.server.domain.image.entity

import com.rainbow.server.domain.BaseEntity
import com.rainbow.server.domain.expense.entity.Expense
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
class Image(
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "expenseId")
    val expense: Expense,
    var originalFileName: String?,
    var saveFileName: String,
) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = 0L

    // @Column
    // var originalFileName: String = originalFileName

    // @Column
    // var saveFileName: String = saveFileName
}
